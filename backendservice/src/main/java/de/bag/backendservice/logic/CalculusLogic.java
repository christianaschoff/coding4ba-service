package de.bag.backendservice.logic;

import org.springframework.stereotype.Component;

import de.bag.backendservice.models.CalculusModel;

@Component
public class CalculusLogic {

    public double calculate(CalculusModel model) {
        if(model == null) {
            return -1;
        }

        if(model.getOperator().equals("plus")) {
            return model.getZahl1() + model.getZahl2();
        }
        
        if(model.getOperator().equals("minus")) {
            return model.getZahl1() - model.getZahl2();
        }

        if(model.getOperator().equals("mal")) {
            return model.getZahl1() * model.getZahl2();
        }

        if(model.getOperator().equals("geteilt")) {
            return model.getZahl1() / model.getZahl2();
        }

        return -1;
    }
    
}
