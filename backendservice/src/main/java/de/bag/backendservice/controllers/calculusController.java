package de.bag.backendservice.controllers;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import de.bag.backendservice.logic.calculusLogic;
import de.bag.backendservice.models.MathematicalModel;

@RestController
@CrossOrigin
public class calculusController {
    
    public calculusController() {        
        super();
    }
 
    @GetMapping("/calculus/{eingabe}")    
    public ResponseEntity<Integer> powerOfTwo(@PathVariable("eingabe") Integer zahl) {
        calculusLogic logic = new calculusLogic();
        Integer ergebnis = logic.powerOfT(zahl);        
        return new ResponseEntity<Integer>(ergebnis, HttpStatus.OK);
    }

    @GetMapping("/calculus/flat/{eingabe}")
    public int powerOfTwoPost(@PathVariable("eingabe") Integer eingabe) {
        Integer ergebnis = eingabe * eingabe;
        System.out.println(eingabe + " = " + ergebnis);
        return ergebnis;
    }

    @PostMapping("/calculus")
    public ResponseEntity<Double> calculate(@RequestBody MathematicalModel mathematicalModel) {
        calculusLogic logic = new calculusLogic();
        double ergebnis = logic.calculate(mathematicalModel);
        System.out.println(ergebnis);
        return new ResponseEntity<Double>(ergebnis, HttpStatus.valueOf(200));
    }
}