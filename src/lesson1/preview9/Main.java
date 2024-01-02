package lesson1.preview9;

public class Main {
    public static void main(String[] args){
        User user =new User();
        User vasya = user.setId(100).setName("vasya");
        System.out.println(vasya);
    }
}
