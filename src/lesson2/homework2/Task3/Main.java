package lesson2.homework2.Task3;

public class Main {
    public static void main(String[] args){
        Journal journal = new Journal("Papyrus", "Paper", "My Journal", "John Doe", "History");
        Comic comic = new Comic("Papyrus", "Paper", "Super Comic", "Jane Doe", "Jack Illustrator");

        System.out.println("Journal details: " + journal);
        System.out.println("Comic details: " + comic);
    }
}
