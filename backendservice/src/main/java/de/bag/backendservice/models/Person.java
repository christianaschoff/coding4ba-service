package de.bag.backendservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    String Vorname;
    String Nachname;
    String Anrede; 
    Integer Alter;   
}
