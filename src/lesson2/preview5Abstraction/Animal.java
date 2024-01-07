package lesson2.preview5Abstraction;

public abstract class Animal {
    boolean isBrain;

    public abstract void signalize();

    public boolean isBrain() {
        return isBrain;
    }

    public void setBrain(boolean brain) {
        isBrain = brain;
    }
}
