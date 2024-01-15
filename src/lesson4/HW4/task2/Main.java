package lesson4.HW4.task2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Створення ArrayList зі словами
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("orange");
        words.add("banana");
        words.add("grape");
        words.add("pineapple");
        words.add("cherry");
        words.add("blueberry");
        words.add("watermelon");
        words.add("strawberry");
        words.add("kiwi");
        words.add("mango");
        words.add("pear");
        words.add("plum");
        words.add("lemon");
        words.add("lime");

        // Відсортувати ArrayList за алфавітом
        Collections.sort(words);

        // Вивести відсортований список
        System.out.println("Відсортований за алфавітом список слів: " + words);
    }
}
