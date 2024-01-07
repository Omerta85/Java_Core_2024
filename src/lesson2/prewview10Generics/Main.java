package lesson2.prewview10Generics;

public class Main {
    public static void main(String[] args){

//        User user = new User(1,"vasya");
//        User user2 = new User("wq12kj","vasya");
//        User[] users = {user, user2};
//        for (User u:users) {
//            if (u.id instanceof String){
//                String id = (String) u.id;
//                System.out.println(id.contains("1235"));
//            }
//
//        }
        User<String> stringUser = new User<>("dasdas", "afasfd");
        User<Integer> integerUser = new User<>(1,"afdha");
        User [] users = {stringUser, integerUser};


        
    }
}
