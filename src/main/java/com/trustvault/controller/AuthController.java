
package com.trustvault.controller;

import com.trustvault.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/api/register")
    public ResponseEntity<Map<String, String>> register(
            @RequestBody Map<String, String> request) {

        String result = userService.registerUser(
                request.get("fullName"),
                request.get("email"),
                request.get("password")
        );

        if (result.equals("Account created successfully!")) {
            return ResponseEntity.ok(Map.of("message", result));
        }

        return ResponseEntity.badRequest().body(Map.of("message", result));
    }

    @PostMapping("/api/login")
    public ResponseEntity<Map<String, String>> login(
            @RequestBody Map<String, String> request) {

        boolean valid = userService.verifyLogin(
                request.get("email"),
                request.get("password")
        );

        if (valid) {
            return ResponseEntity.ok(
                    Map.of("message", "Credentials verified")
            );
        }

        return ResponseEntity.status(401).body(
                Map.of("message", "Invalid email or password")
        );
    }
}
