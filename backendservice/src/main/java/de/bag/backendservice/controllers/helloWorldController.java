package de.bag.backendservice.controllers;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldController {

    @GetMapping("/")
    ResponseEntity<String> basicGet() {        
        return new ResponseEntity<String>("Hello World", HttpStatusCode.valueOf(200));
    }

    @PostMapping("/")
    ResponseEntity<String> basicPost() {
        return new ResponseEntity<String>("Hello World", HttpStatusCode.valueOf(200));
    }
}
