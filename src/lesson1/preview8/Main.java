package lesson1.preview8;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        User[] users = new User[3];
//        users[0] = new User (1,"vasya");
//        users[1] = new User (2,"petya");
//        users[2] = new User (3,"kolya");
//        System.out.println(users);
//        System.out.println(Arrays.toString(users));
//        ArrayList<User> users = new ArrayList();
//        users.add( new User(1, "aasd"));
//        users.add(new User(2, "qwe"));
//        System.out.println(users);
//        System.out.println(users.get(0));
//        System.out.println(users.size());
        User vasya = new User(1,"vasya");
        ArrayList<String> skills = vasya.getSkills();
        skills.add("java");
        skills.add("java2");
        skills.add("java8");
        skills.add("java9");
        skills.add("java 17");
        System.out.println(vasya);
        skills.remove(0);
        System.out.println(vasya);

    }
}
