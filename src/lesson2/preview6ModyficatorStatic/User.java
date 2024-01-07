package lesson2.preview6ModyficatorStatic;

public class User {
//    public static int counter = 0;
//
//    public User(){
//        counter = counter + 1;
//    }
    private static User instance;
    private String name;
    private User(String name){
        this.name = name;
    }
    public static User getInstance(String name){
        if(instance == null) {
            instance = new User(name);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
