package lesson3.preview1Interfaces;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args){
        ArrayList<Singer> singers = new ArrayList<>();
        singers.add(new Student());
        singers.add(new User());
        Singer singer = singers.get(1);
        singer.sing();
    }
}
