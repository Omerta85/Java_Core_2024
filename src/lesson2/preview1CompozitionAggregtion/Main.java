package lesson2.preview1CompozitionAggregtion;

public class Main {
    public  static void main(String[] args){

        Passport passport = new Passport("sdasdads", "1213123cc");
        User user = new User(1, "vasya", passport);
        User user2 = new User(1, "vasya", "qweqwe", "121sdvklsdjhlksd");
        Customer customer = new Customer("asd", "qwe", passport);
    }
}
