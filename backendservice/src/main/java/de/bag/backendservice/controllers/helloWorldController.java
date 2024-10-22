package de.bag.backendservice.controllers;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import de.bag.backendservice.logic.AnredeLogic;
import de.bag.backendservice.models.PersonModel;

@RestController
public class helloWorldController {

    @GetMapping("/")
    ResponseEntity<String> basicGet() {        
        return new ResponseEntity<String>("Hello World", HttpStatus.OK);
    }

    @PostMapping("/")
    ResponseEntity<PersonModel> basicPost(@RequestBody PersonModel eingabe) {  
        eingabe.setAnrede(eingabe.getAnrede().toUpperCase());    
            
        return new ResponseEntity<PersonModel>(eingabe, HttpStatusCode.valueOf(200));
    }
}
