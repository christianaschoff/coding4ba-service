package de.bag.backendservice.logic;

import org.springframework.stereotype.Component;

import de.bag.backendservice.models.MathematicalModel;

@Component
public class calculusLogic {
    public Integer powerOfT(Integer eingabe) {
        if(eingabe > 0) {
            return 1;
        } 
        if(eingabe < 0)  {
            return -1;
        }        
        return 0;
    }

    public double calculate(MathematicalModel math) {

        if(math.getOperation().equals("+")) {
            return math.getZahl1() + math.getZahl2();
        }

        if(math.getOperation().equals("-")) {
            return math.getZahl1() - math.getZahl2();
        }

        if(math.getOperation().equals("*")) {
         
            return math.getZahl1() * math.getZahl2();
        }
        if(math.getOperation().equals("/")) {
            return math.getZahl1() / math.getZahl2();
        }

        return 0;
    }
}
