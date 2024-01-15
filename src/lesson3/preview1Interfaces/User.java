package lesson3.preview1Interfaces;

public class User implements Singer {

    private String msg;
    public void sing() {
        System.out.println("lolololo" + msg + this.greeting());
    }
    public String greeting() {
        return "hello";
    }
}
