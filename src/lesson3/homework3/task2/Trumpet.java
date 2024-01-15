package lesson3.homework3.task2;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Trumpet implements Instrument{
    private double diameter;

    public Trumpet(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Playing trumpet with diameter " + diameter);
    }
}
