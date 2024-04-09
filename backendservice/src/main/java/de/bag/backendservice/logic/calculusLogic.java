package de.bag.backendservice.logic;

import org.springframework.stereotype.Component;

import de.bag.backendservice.models.calculusModel;

@Component
public class calculusLogic {

    public int calculatePowerOfTwo(int zahl) {
        if(zahl <= 0) {
            return 0;
        }        
        return zahl * zahl;
    }

    public double calculator(calculusModel model) {
        if(model == null) {
            return 0;
        }

        switch(model.getOperant()) {
            case "+": 
                return model.getZahl1() + model.getZahl2();
            case "-": 
                return model.getZahl1() - model.getZahl2();
            case "*":             
                return model.getZahl1() * model.getZahl2();
            case "/": 
                return model.getZahl1() / model.getZahl2();                
            default:
                return 0;
        }
    }
}
