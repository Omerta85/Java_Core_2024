package lesson4.HW4.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Створення списку користувачів
        List<User> users = new ArrayList<>();
        users.add(new User("Vova", 25));
        users.add(new User("Andriy", 30));
        users.add(new User("Stjopa", 22));
        users.add(new User("Misha", 24));
        users.add(new User("Mariya", 25));
        users.add(new User("Myroslav", 38));

        // Відсортувати за віком (зростання)
        Collections.sort(users, Comparator.comparingInt(User::getAge));
        System.out.println("Сортування за віком (зростання): " + users);

        // Відсортувати за віком (спадання)
        Collections.sort(users, Comparator.comparingInt(User::getAge).reversed());
        System.out.println("Сортування за віком (спадання): " + users);

        // Відсортувати за кількістю знаків в імені (зростання)
        Collections.sort(users, Comparator.comparingInt(user -> user.getName().length()));
        System.out.println("Сортування за кількістю знаків в імені (зростання): " + users);

        // Відсортувати за кількістю знаків в імені (спадання)
        Collections.sort(users, Comparator.comparingInt(user -> -user.getName().length()));
        System.out.println("Сортування за кількістю знаків в імені (спадання): " + users);
    }
}
