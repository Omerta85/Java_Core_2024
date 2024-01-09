package lesson2.homework2.Task3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Journal extends Book{
    private String genre;

    public Journal(String material, String writingSurface, String title, String author, String genre) {
        super(material, writingSurface, title, author);
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "genre='" + genre + '\'' +
                "} " + super.toString();
    }

}
