package de.bag.backendservice.logic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import de.bag.backendservice.models.calculusModel;

public class calculusLogicTest {

    @Test
    void calculatePowerOfTwo_5_5() {        
        calculusLogic calc = new calculusLogic();
        Integer testwert = 5;
        Integer ergebnis = calc.calculatePowerOfTwo(testwert);

        assertEquals(Integer.valueOf(25), ergebnis);        
    }

    @Test
    void calculatePowerOfTwo_minus5_0() {        
        calculusLogic calc = new calculusLogic();
        Integer testwert = -5;

        Integer ergebnis = calc.calculatePowerOfTwo(testwert);

        assertEquals(Integer.valueOf(0), ergebnis);        
    }

    @Test
    void calculatePowerOfTwo_0_0() {        
        calculusLogic calc = new calculusLogic();
        Integer testwert = 0;

        Integer ergebnis = calc.calculatePowerOfTwo(testwert);

        assertEquals(Integer.valueOf(0), ergebnis);        
    }

    @Test
    void calculator_null_0() {
        calculusLogic calc = new calculusLogic();

        double ergebnis = calc.calculator(null);
        assertEquals(0, ergebnis);
    }

    @Test
    void calculator_plus_20() {
        calculusLogic calc = new calculusLogic();
        double zahl1 = 5;
        double zahl2 = 15;
        String operant = "+";
        calculusModel model = new calculusModel(zahl1, operant, zahl2);
        
        double ergebnis = calc.calculator(model);

        assertEquals(20, ergebnis);
    }

    @Test
    void calculator_minus_5() {
        calculusLogic calc = new calculusLogic();
        double zahl1 = 15;
        double zahl2 = 10;
        String operant = "-";
        calculusModel model = new calculusModel(zahl1, operant, zahl2);
        
        double ergebnis = calc.calculator(model);

        assertEquals(5, ergebnis);
    }

    @Test
    void calculator_mal_35() {
        calculusLogic calc = new calculusLogic();
        double zahl1 = 5;
        double zahl2 = 7;
        String operant = "*";
        calculusModel model = new calculusModel(zahl1, operant, zahl2);
        
        double ergebnis = calc.calculator(model);

        assertEquals(35, ergebnis);
    }

    @Test
    void calculator_geteilt_5() {
        calculusLogic calc = new calculusLogic();
        double zahl1 = 25;
        double zahl2 = 5;
        String operant = "/";
        calculusModel model = new calculusModel(zahl1, operant, zahl2);
        
        double ergebnis = calc.calculator(model);
        
        assertEquals(5, ergebnis);
    }

    @Test
    void calculator_geteilt_infinite() {
        calculusLogic calc = new calculusLogic();
        double zahl1 = 25;
        double zahl2 = 0;
        String operant = "/";
        calculusModel model = new calculusModel(zahl1, operant, zahl2);
        
        double ergebnis = calc.calculator(model);
        
        assertTrue(Double.isInfinite(ergebnis));
    }

    @Test
    void calculator_geteilt_0() {
        calculusLogic calc = new calculusLogic();
        double zahl1 = 0;
        double zahl2 = 25;
        String operant = "/";
        calculusModel model = new calculusModel(zahl1, operant, zahl2);
        
        double ergebnis = calc.calculator(model);
        
        assertEquals(0, ergebnis);
    }
}
