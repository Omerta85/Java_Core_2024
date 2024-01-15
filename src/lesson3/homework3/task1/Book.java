package lesson3.homework3.task1;


import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor

public class Book implements Printable{
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Printing book: " + title);
    }
}
