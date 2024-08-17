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

/*
    @GetMapping(value = "/x", produces= MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String htmlGet() throws IOException {
        var str = getClass().getClassLoader().getResourceAsStream("static/page.html");
        return readFromInputStream(str);
    }

    private String readFromInputStream(InputStream inputStream) throws IOException {
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br
        = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        }
        return resultStringBuilder.toString();
    }
  */
}
