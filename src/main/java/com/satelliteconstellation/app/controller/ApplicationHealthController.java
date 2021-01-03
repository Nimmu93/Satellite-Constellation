package com.satelliteconstellation.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationHealthController {

    @GetMapping("/health")
    ResponseEntity<String> checkHealth() {
        return new ResponseEntity<>("I am alive", HttpStatus.OK);
    }
}
