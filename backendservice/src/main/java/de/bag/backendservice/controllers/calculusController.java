package de.bag.backendservice.controllers;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calculusController {
    
    public calculusController() {        
        super();
    }
 
    @GetMapping("/calculus/{eingabe}")
    public ResponseEntity<Integer> powerOfTwo(@PathVariable("eingabe") Integer zahl) {
        Integer ergebnis = zahl * zahl;
        return new ResponseEntity<Integer>(ergebnis,  HttpStatusCode.valueOf(200));
    }
}