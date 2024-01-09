package lesson2.homework2.Task3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Papyrus {
    private String material;
    private String writingSurface;

    @Override
    public String toString() {
        return "Papyrus{" +
                "material='" + material + '\'' +
                ", writingSurface='" + writingSurface + '\'' +
                '}';
    }
}
