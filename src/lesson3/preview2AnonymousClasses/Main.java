package lesson3.preview2AnonymousClasses;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args){
//        ArrayList<Singer> singers = new ArrayList<>();
//        singers.add(new Student());
//        singers.add( new User());
//        Singer singer = singers.get(1);
//        singer.sing();
        Singer singer = new Singer() {
            @Override
            public void sing() {
                Singer.super.sing();
            }
        };
    }
}
