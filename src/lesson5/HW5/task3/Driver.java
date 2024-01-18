package lesson5.HW5.task3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Driver {
    private String name;
    private int age;
    private int drivingExperience;

    public void increaseDrivingExperience() {
        this.drivingExperience++;
    }
}
