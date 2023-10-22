package com.example.gestionclasses;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class tryrest {
    @GetMapping("/display")
    public ResponseEntity<String> displayText() {
        String message = "Hello, this is text displayed on a page!";
        return ResponseEntity.ok(message);
    }
}
