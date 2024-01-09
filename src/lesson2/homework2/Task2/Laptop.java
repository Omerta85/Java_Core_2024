package lesson2.homework2.Task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Laptop extends PC {
    private double screenSize;
    private int batteryLife;

    public Laptop(String brand, String model, int year, double screenSize, int batteryLife) {
        super(brand, model, year);
        this.screenSize = screenSize;
        this.batteryLife = batteryLife;
    }
    @Override
    public String toString() {
        return "Laptop{" +
                "screenSize=" + screenSize +
                ", batteryLife=" + batteryLife +
                "} " + super.toString();
    }

}
