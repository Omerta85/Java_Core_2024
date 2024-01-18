package lesson5.HW5.task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Створити масив з 20 числами
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        // Відсортувати масив
        Arrays.sort(numbers);

        System.out.println("Відсортований масив: " + Arrays.toString(numbers));

        // Відфільтрувати числа кратні 3
        int[] multiplesOf3 = Arrays.stream(numbers)
                .filter(num -> num % 3 == 0)
                .toArray();

        System.out.println("Числа кратні 3: " + Arrays.toString(multiplesOf3));

        // Відфільтрувати числа кратні 10
        int[] multiplesOf10 = Arrays.stream(numbers)
                .filter(num -> num % 10 == 0)
                .toArray();

        System.out.println("Числа кратні 10: " + Arrays.toString(multiplesOf10));

        // Перебрати масив за допомогою foreach()
        System.out.print("Масив після foreach(): ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Перебрати масив за допомогою map() і отримати новий масив, в якому всі значення будуть у 3 рази більші
        int[] tripledNumbers = Arrays.stream(numbers)
                .map(num -> num * 3)
                .toArray();

        System.out.println("Масив зі значеннями у 3 рази більше: " + Arrays.toString(tripledNumbers));
    }
    }

