package lesson2.homework2.Task3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Book extends Papyrus {
    private String title;
    private String author;

    public Book(String material, String writingSurface, String title, String author) {
        super(material, writingSurface);
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                "} " + super.toString();
    }
}
