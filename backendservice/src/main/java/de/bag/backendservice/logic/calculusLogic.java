package de.bag.backendservice.logic;

import org.springframework.stereotype.Component;

@Component
public class calculusLogic {

    public int calculatePowerOfTwo(int zahl) {
        if(zahl <= 0) {
            return 0;
        }        
        return zahl * zahl;
    }
}
