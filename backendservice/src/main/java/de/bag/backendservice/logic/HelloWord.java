package de.bag.backendservice.logic;

import java.math.BigDecimal;
import java.math.BigInteger;

public class HelloWord { 
    
    private String itsMe = "";

    public HelloWord(String name) {
        this.itsMe = name;
    }

    public String sayHello() {
        String message = "Hallo " + this.itsMe;
        return message;
    }

    public void datentypen() {        
        // primitive (value types)
        int zahl = 0; // 32 bit
        long zahlGross = 0; // 64 bit
        float fliesskommaKlein = (float)0.0; //32 bit
        double fliesskommaGross = 0.0; //64 bit
        boolean jaNein = true;

        // hybrid
        String meinString = "Hallo";

        // Complex Reference Types 
        BigDecimal ichBinEigentlichEinDouble = BigDecimal.valueOf(5);
        BigInteger ichBinEigentlichEinLong = BigInteger.valueOf(5);
        MyDataStructure myStructure = new MyDataStructure("Christian", "Aschoff");
    }

    class MyDataStructure {
        
        private String vorname;
        public String getVorname() {
            return vorname;
        }

        public void setVorname(String vorname) {
            this.vorname = vorname;
        }

        private String nachname;

        public String getNachname() {
            return nachname;
        }

        public void setNachname(String nachname) {
            this.nachname = nachname;
        }

        public MyDataStructure(String vorname, String nachname) {
            this.vorname = vorname;
            this.nachname = nachname;            
        }
    }

}
