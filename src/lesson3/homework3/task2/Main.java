package lesson3.homework3.task2;

public class Main {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[3]; // Допустимо, що у нас є гітара, барабан і труба

        instruments[0] = new Guitar(6);
        instruments[1] = new Drum(22);
        instruments[2] = new Trumpet(3.5);

        // Викликати метод play() для кожного інструменту в масиві
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
