package lesson2.preview5Abstraction;

public class Horse extends Animal {
    private int legs;
    private String power;

    public int getLegs() {
        return legs;
    }

    @Override
    public void signalize() {
        System.out.println("igogogo");
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }
}
