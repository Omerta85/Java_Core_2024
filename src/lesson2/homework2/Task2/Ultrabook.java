package lesson2.homework2.Task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ultrabook extends Laptop{
    private boolean isUltraThin;

    public Ultrabook(String brand, String model, int year, double screenSize, int batteryLife, boolean isUltraThin) {
        super(brand, model, year, screenSize, batteryLife);
        this.isUltraThin = isUltraThin;
    }

    @Override
    public String toString() {
        return "Ultrabook{" +
                "isUltraThin=" + isUltraThin +
                "} " + super.toString();
    }
}
