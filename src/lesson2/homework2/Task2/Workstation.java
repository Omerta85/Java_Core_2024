package lesson2.homework2.Task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Workstation extends Laptop {
    private boolean isEccMemorySupported;
    private String graphicsCard;

    public Workstation(String brand, String model, int year, double screenSize, int batteryLife, boolean isEccMemorySupported, String graphicsCard) {
        super(brand, model, year, screenSize, batteryLife);
        this.isEccMemorySupported = isEccMemorySupported;
        this.graphicsCard = graphicsCard;
    }
    @Override
    public String toString() {
        return "Workstation{" +
                "isEccMemorySupported=" + isEccMemorySupported +
                ", graphicsCard='" + graphicsCard + '\'' +
                "} " + super.toString();
    }
}
