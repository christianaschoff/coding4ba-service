package de.bag.backendservice.logic;
import de.bag.backendservice.models.MathematicalModel;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class calculusLogicTest {
    
    @Test
    void calculate_2plus2_4() {
        // arrange
        calculusLogic calculusLogic = new calculusLogic();
        MathematicalModel mathematicalModel = new MathematicalModel("*", 1, 1);

        // act
        double ergebnis = calculusLogic.calculate(mathematicalModel);

        // assert
        assertEquals(1, ergebnis);

    }
}
