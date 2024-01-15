package lesson3.homework3.task1;

public class Main {
    public static void main(String[] args){
        Printable[] printableItems = new Printable[4]; // Допустимо, що у нас є 2 книги та 2 журнали

        printableItems[0] = new Book("Java Programming");
        printableItems[1] = new Magazine("Tech News");
        printableItems[2] = new Book("Data Structures and Algorithms");
        printableItems[3] = new Magazine("Science Today");

        // Виклик методу print() для кожного об'єкту в масиві
        for (Printable printable : printableItems) {
            printable.print();
        }
    }
}
