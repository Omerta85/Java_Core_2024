package lesson2.preview6ModyficatorStatic;

public class Main {
    public static void main(String[] args){
//        User user = new User();
//        User user1 = new User();
//        User user2 = new User();
//        User user3 = new User();
//        User user4 = new User();
//        User user5 = new User();
//        System.out.println(User.counter);
        User vasya = User.getInstance("Vasya");
        User petya = User.getInstance("Petya");
        System.out.println(petya);


    }
}
