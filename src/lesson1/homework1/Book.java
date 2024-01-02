package lesson1.homework1;

public class Book {
    private String title; // title
    private int pages; // pages
    private String author; // [String] Authors  "John Doe"
    private String genre; // genre

    public Book() {
    }

    public Book(String title, String author, int pages, String genre) {
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.genre = genre;
    }

    // Гетери та сетери
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    // Метод toString()
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages + '\'' +
                ", author='" + author + '\'' +
                ", genre=" + genre +
                '}';

    }
}
