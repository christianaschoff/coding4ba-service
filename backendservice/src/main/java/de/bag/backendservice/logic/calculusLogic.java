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

    public int powerOfTwo(int zahl) {
        if(zahl <= 0) {
            return 0;
        }

        if(zahl == 5) {
            return zahl + zahl;
        }

        return zahl * zahl;
    }

    public Double caluculator(calculusModel eingabe) {

        if(eingabe.getOperator().equals("+")) {
            return eingabe.getZahl1() + eingabe.getZahl2();
        }

        if(eingabe.getOperator().equals("-")) {
            return eingabe.getZahl1() - eingabe.getZahl2();
        }

        if(eingabe.getOperator().equals("/")) {
            return eingabe.getZahl1() / eingabe.getZahl2();
        }

        if(eingabe.getOperator().equals("*")) {
            return eingabe.getZahl1() * eingabe.getZahl2();
        }

        return 0.0;        
    }
}
