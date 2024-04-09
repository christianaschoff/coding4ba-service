package de.bag.backendservice.logic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class calculusLogicTest {

    @Test
    void testCalculatePowerOfTwo_5_5() {        
        calculusLogic calc = new calculusLogic();
        Integer testwert = 5;
        Integer ergebnis = calc.calculatePowerOfTwo(testwert);

        assertEquals(Integer.valueOf(25), ergebnis);        
    }

    @Test
    void testCalculatePowerOfTwo_minus5_0() {        
        calculusLogic calc = new calculusLogic();
        Integer testwert = -5;

        Integer ergebnis = calc.calculatePowerOfTwo(testwert);

        assertEquals(Integer.valueOf(0), ergebnis);        
    }

    @Test
    void testCalculatePowerOfTwo_0_0() {        
        calculusLogic calc = new calculusLogic();
        Integer testwert = 0;

        Integer ergebnis = calc.calculatePowerOfTwo(testwert);

        assertEquals(Integer.valueOf(0), ergebnis);        
    }
}
