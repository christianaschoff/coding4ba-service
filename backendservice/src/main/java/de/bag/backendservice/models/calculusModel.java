package de.bag.backendservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CalculusModel {    
    double zahl1;
    double zahl2;
    String operator;
}
