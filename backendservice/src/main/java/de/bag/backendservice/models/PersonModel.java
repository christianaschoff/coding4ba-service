package de.bag.backendservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonModel {
    String vorname;
    String nachname;
    String anrede;
}
