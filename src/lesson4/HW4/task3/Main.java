package lesson4.HW4.task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person(1, "vasya", "pupkin", "asd@asd.com", 31, Gender.MALE,
                        Set.of(new Skill("java", 10), new Skill("js", 10), new Skill("c++", 10)),
                        new Car("toyota", 2021, 250)),
                new Person(2, "anna", "smith", "anna@email.com", 28, Gender.FEMALE,
                        Set.of(new Skill("python", 8), new Skill("ruby", 7)),
                        new Car("honda", 2020, 200)),
                new Person(3, "oleg", "ivanov", "oleg@email.com", 35, Gender.MALE,
                        Set.of(new Skill("java", 12), new Skill("python", 8), new Skill("sql", 10)),
                        new Car("bmw", 2022, 300)),
                new Person(4, "maria", "johnson", "maria@email.com", 26, Gender.FEMALE,
                        Set.of(new Skill("javascript", 9), new Skill("react", 7)),
                        new Car("audi", 2021, 280)),
                new Person(5, "sergey", "kuznetsov", "sergey@email.com", 40, Gender.MALE,
                        Set.of(new Skill("c#", 15), new Skill("asp.net", 10)),
                        new Car("mercedes", 2020, 350)),
                new Person(6, "elena", "smirnova", "elena@email.com", 29, Gender.FEMALE,
                        Set.of(new Skill("java", 10), new Skill("html", 8), new Skill("css", 8)),
                        new Car("volvo", 2022, 270)),
                new Person(7, "igor", "petrov", "igor@email.com", 32, Gender.MALE,
                        Set.of(new Skill("python", 10), new Skill("django", 7), new Skill("flask", 5)),
                        new Car("tesla", 2023, 400)),
                new Person(8, "olga", "ivanova", "olga@email.com", 27, Gender.FEMALE,
                        Set.of(new Skill("ruby", 8), new Skill("rails", 6)),
                        new Car("lexus", 2020, 320)),
                new Person(9, "dmitry", "kotov", "dmitry@email.com", 36, Gender.MALE,
                        Set.of(new Skill("javascript", 10), new Skill("node.js", 8), new Skill("mongodb", 6)),
                        new Car("jaguar", 2021, 300)),
                new Person(10, "svetlana", "pavlova", "svetlana@email.com", 25, Gender.FEMALE,
                        Set.of(new Skill("java", 7), new Skill("spring", 5)),
                        new Car("subaru", 2022, 250))
        );

// Створення HashSet та додавання об'єктів
        Set<Person> personSet = new HashSet<>();
        personSet.addAll(persons);


        Iterator<Person> iterator = personSet.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getGender() == Gender.MALE) {
                iterator.remove();
            }
        }

        System.out.println("HashSet після видалення чоловіків: " + personSet);

        // Створення TreeSet та додавання об'єктів
        Set<Person> personTreeSet = new TreeSet<>(Comparator.comparingInt(p -> p.getSkills().size()));
        personTreeSet.addAll(persons);

        System.out.println("TreeSet після сортування за кількістю скілів: " + personTreeSet);
    }
}
