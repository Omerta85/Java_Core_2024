package lesson1.homework1;

public class BookDemo {
    public static void main(String[] args){
        Book book1 = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 223, "Fantasy");
        Book book2 = new Book("The Lord of the Rings: The Fellowship of the Ring", "J.R.R. Tolkien", 423,"Adventure");
        Book book3 = new Book("Nineteen Eighty-Four", "George Orwell", 328,"Dystopian");
        Book book4 = new Book("The Catcher in the Rye", "J.D. Salinger", 214, "Realistic fiction");
        Book book5 = new Book("The Da Vinci Code", "Dan Brown", 454, "Mystery");
        Book[] books = {book1, book2, book3, book4, book5};

        System.out.println("Books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

}
