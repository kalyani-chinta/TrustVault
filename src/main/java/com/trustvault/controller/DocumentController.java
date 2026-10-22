
package com.trustvault.controller;

import com.trustvault.Document;
import com.trustvault.DocumentRepository;
import com.trustvault.AuditLog;
import com.trustvault.AuditLogRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/documents")
public class DocumentController {

    private final DocumentRepository documentRepository;
    private final AuditLogRepository auditLogRepository;

    public DocumentController(
            DocumentRepository documentRepository,
            AuditLogRepository auditLogRepository) {
        this.documentRepository = documentRepository;
        this.auditLogRepository = auditLogRepository;
    }

    @PostMapping
    public ResponseEntity<?> createDocument(
            @RequestBody Map<String, String> request,
            HttpSession session) {

        Long userId = (Long) session.getAttribute("userId");

        if (userId == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body(Map.of("message", "Please log in first"));
        }

        String title = request.get("title");
        String content = request.get("content");

        if (title == null || title.isBlank()
                || content == null || content.isBlank()) {
            return ResponseEntity.badRequest()
                    .body(Map.of("message", "Title and content are required"));
        }

        Document document = new Document();
        document.setTitle(title.trim());
        document.setContent(content);
        document.setOwnerId(userId);

        Document saved = documentRepository.save(document);

        auditLogRepository.save(
                new AuditLog(userId, saved.getId(), "CREATE"));

        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @GetMapping
    public ResponseEntity<?> getMyDocuments(HttpSession session) {

        Long userId = (Long) session.getAttribute("userId");

        if (userId == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body(Map.of("message", "Please log in first"));
        }

        List<Document> documents =
                documentRepository.findByOwnerId(userId);

        return ResponseEntity.ok(documents);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> openDocument(
            @PathVariable Long id,
            HttpSession session) {

        Long userId = (Long) session.getAttribute("userId");

        if (userId == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body(Map.of("message", "Please log in first"));
        }

        return documentRepository.findById(id)
                .map(document -> {
                    if (!document.getOwnerId().equals(userId)) {
                        return ResponseEntity.status(HttpStatus.FORBIDDEN)
                                .body(Map.of("message",
                                        "You cannot access this document"));
                    }

                    auditLogRepository.save(
                            new AuditLog(userId, id, "OPEN"));

                    return ResponseEntity.ok(document);
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
