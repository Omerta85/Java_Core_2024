package lesson2.homework2.Task1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {
    private String street;
    private String suite;
    private String city;
    private int zipcode;
    private Geo geo;
}
