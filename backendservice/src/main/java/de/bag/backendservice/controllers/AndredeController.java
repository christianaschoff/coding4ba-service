package de.bag.backendservice.controllers;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class AndredeController {

    @GetMapping("/anrede")
    public ResponseEntity<String> GetAnrede() {        
  
        return new ResponseEntity<String>("Frau", HttpStatusCode.valueOf(200));
    }   

    @GetMapping("/anrede/{anrede}")
    public ResponseEntity<String> GetAnredeAnrede(@PathVariable("anrede") String anrede) {
        String anredeMitName = (anrede.equals("frau") ? anrede.toUpperCase() : anrede) + " Melanie Meyer";     

        return new ResponseEntity<String>(anredeMitName, HttpStatusCode.valueOf(200));
    }  
    
}
