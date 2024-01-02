package lesson1.preview5;


public class Main {
    public static  void main(String[]args) {
        new User();

        User user2 = new User(2,"kokos", false, 55.5);
        System.out.println(user2);

        user2.setName("qyewy");
        System.out.println(user2.getName());
    }
}
