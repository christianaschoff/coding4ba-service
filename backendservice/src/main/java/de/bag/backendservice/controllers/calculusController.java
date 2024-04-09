package de.bag.backendservice.controllers;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import de.bag.backendservice.logic.calculusLogic;
import de.bag.backendservice.models.calculusModel;

@RestController
public class calculusController {
    
    private calculusLogic _calculusLogic;
    public calculusController(calculusLogic calculusLogic) {
        super();
        this._calculusLogic = calculusLogic;        
    }
 
    @GetMapping("/calculus/{eingabe}")
    public ResponseEntity<Integer> powerOfTwo(@PathVariable("eingabe") Integer zahl) {
        Integer ergebnis = this._calculusLogic.calculatePowerOfTwo(zahl);
        return new ResponseEntity<Integer>(ergebnis,  HttpStatusCode.valueOf(200));
    }

    @PostMapping("/calculus")
    public ResponseEntity<Double> calculator(@RequestBody calculusModel input) {
        double ergebnis = this._calculusLogic.calculator(input);
        return new ResponseEntity<Double>(ergebnis, HttpStatusCode.valueOf(200));
    }
}