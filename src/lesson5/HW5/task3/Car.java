package lesson5.HW5.task3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private String brand;
    private int enginePower;
    private Driver owner;
    private double price;
    private int yearOfManufacture;
    public void increaseEnginePower() {
        this.enginePower = (int) (this.enginePower * 1.1);
    }
}
