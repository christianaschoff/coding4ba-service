package de.bag.backendservice.controllers;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import de.bag.backendservice.logic.CalculusLogic;
import de.bag.backendservice.models.CalculusModel;

@RestController
@CrossOrigin
public class calculusController {
    
    CalculusLogic calculuslogic;

    public calculusController(CalculusLogic logic) {
        super();
        this.calculuslogic = logic;    
    }

    @PostMapping("/calculus")
    ResponseEntity<Double> calc(@RequestBody CalculusModel model){
        double result = calculuslogic.calculate(model);
        return new ResponseEntity<Double>(result, HttpStatusCode.valueOf(200));
    } 

}