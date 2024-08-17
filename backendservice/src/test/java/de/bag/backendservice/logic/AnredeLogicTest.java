package de.bag.backendservice.logic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AnredeLogicTest {

    @Test
    public void ermittleName_vornameNachname_correctName() {
        AnredeLogic anredeLogic = new AnredeLogic("Herbert", "Meier");

        String ergebnis = anredeLogic.ermittleName();

        assertEquals("Herbert Meier", ergebnis);
    }

    @Test
    public void ermittleName_NullNull_correctName() {
        AnredeLogic anredeLogic = new AnredeLogic(null, null);

        String ergebnis = anredeLogic.ermittleName();

        assertEquals("null null", ergebnis);
    }
}
