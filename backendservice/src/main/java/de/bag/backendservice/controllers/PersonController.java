package de.bag.backendservice.controllers;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import de.bag.backendservice.models.Person;

@RestController
public class PersonController {
    public PersonController() {
        super();        
    }

    @PostMapping("/person")
    public ResponseEntity<Person> upper(@RequestBody Person request) {
        Person response = request;
        response.setAnrede(request.getAnrede().toUpperCase());
        response.setAlter(request.getAlter() * request.getAlter());
        return new ResponseEntity<Person>(response, HttpStatusCode.valueOf(200));
    }
}
