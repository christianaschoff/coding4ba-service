package de.bag.backendservice.controllers;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import de.bag.backendservice.models.PersonModel;

@RestController
public class PersonController {
    
    @PostMapping("/gross")
    public ResponseEntity<PersonModel> machMaAnredeGrossBitte(@RequestBody PersonModel klein) {

        PersonModel rueckgabeModel = new PersonModel();
        rueckgabeModel.setAnrede(klein.getAnrede().toUpperCase());
        rueckgabeModel.setVorname(klein.getVorname().toUpperCase());
        rueckgabeModel.setNachname(klein.getNachname().toLowerCase());

        return new ResponseEntity<PersonModel>(rueckgabeModel, HttpStatusCode.valueOf(200));
    }

}
