package lesson2.homework2.Task3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comic extends Book {
    private String illustrator;

    public Comic(String material, String writingSurface, String title, String author, String illustrator) {
        super(material, writingSurface, title, author);
        this.illustrator = illustrator;
    }

    @Override
    public String toString() {
        return "Comic{" +
                "illustrator='" + illustrator + '\'' +
                "} " + super.toString();
    }
}
