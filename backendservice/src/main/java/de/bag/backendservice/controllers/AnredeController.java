package de.bag.backendservice.controllers;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import de.bag.backendservice.logic.AnredeLogic;

@RestController
@CrossOrigin
public class AnredeController { 
    
    @GetMapping("/anrede")
    public ResponseEntity<String> GetAnrede() {        
        AnredeLogic anredeObjectMM = new AnredeLogic("Melanie", "Meyer");        
        String nameMitAnrede = anredeObjectMM.ermittleNameMitAnrede("Frau");
        return new ResponseEntity<String>(nameMitAnrede, HttpStatusCode.valueOf(200));
    }   

    @GetMapping("/anrede/{anrede}")
    public ResponseEntity<String> GetAnredeAnrede(@PathVariable("anrede") String anrede) {
        AnredeLogic anredeObjectMM = new AnredeLogic("Melanie", "Meyer");
        String nameMitAnrede = anredeObjectMM.grossKlein(anrede);

        Integer x = 5; //x hat der Wert 5
        String y = "Hallo"; //y hat den Wert Hallo
       

        return new ResponseEntity<String>(nameMitAnrede, HttpStatusCode.valueOf(200));
    }  
    private Integer bla(Integer x) {
        if(x > 5) {
            return 1;
        }else if (x == 5) {
            return 0;        
        } else {
            return -1;
        }
    } 

}
