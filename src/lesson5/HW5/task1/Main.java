package lesson5.HW5.task1;

import java.util.*;



public class Main {

    public static void main(String[] args) {
        // Створення ArrayList зі словами
        List<String> wordsList = new ArrayList<>();
        wordsList.add("apple");
        wordsList.add("banana");
        wordsList.add("orange");
        wordsList.add("grape");
        wordsList.add("kiwi");
        wordsList.add("melon");
        wordsList.add("pear");
        wordsList.add("peach");
        wordsList.add("strawberry");
        wordsList.add("blueberry");
        wordsList.add("cherry");
        wordsList.add("pineapple");
        wordsList.add("mango");
        wordsList.add("watermelon");
        wordsList.add("lemon");

        // Відсортувати за алфавітом
        Collections.sort(wordsList);
        System.out.println("Сортований за алфавітом ArrayList: " + wordsList);

        // Відфільтрувати слова за довжиною
        List<String> filteredWords = wordsList.stream()
                .filter(word -> word.length() <= 4)
                .toList();
        System.out.println("Відфільтровані слова довжиною менше 5 символів: " + filteredWords);
    }
}
