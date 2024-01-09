package lesson2.homework2.Task4;

public class Main {
    public static void main(String[] args){
        Skill[] skills = {
                new Skill("java", 10),
                new Skill("js", 10),
                new Skill("c++", 10)
        };

        Car car = new Car("toyota", 2021, 250);

        Person person = new Person(1, "vasya", "pupkin", "asd@asd.com", 31, Gender.MALE, skills, car);

        System.out.println(person);

    }
}
