
package com.example.palindrome;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class PalindromeController {

    @PostMapping("/palindrome")
    public ResponseEntity<?> check(@RequestBody Map<String, String> payload) {
        String text = payload.getOrDefault("text", "");
        boolean result = isPalindrome(text);
        return ResponseEntity.ok(Map.of("text", text, "palindrome", result));
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }

    private boolean isPalindrome(String s) {
        if (s == null) return false;
        String cleaned = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int i = 0, j = cleaned.length() - 1;
        while (i < j) {
            if (cleaned.charAt(i++) != cleaned.charAt(j--)) return false;
            }
        return true;
    }
}
