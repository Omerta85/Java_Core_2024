package lesson1.homework1;

public class Car {
    private String model; // model
    private int   power; //power
    private double volumeEngine; // volumeEngine
    private  boolean turbo; // turbo

    public Car() {
    }
    // Конструктор
    public Car(String model, int power, double volumeEngine, boolean turbo) {
        this.model = model;
        this.power = power;
        this.volumeEngine = volumeEngine;
        this.turbo = turbo;
    }

    // Гетери та сетери
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getVolumeEngine() {
        return volumeEngine;
    }

    public void setVolumeEngine(double volumeEngine) {
        this.volumeEngine = volumeEngine;
    }

    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }


    // Метод toString()
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", power=" + power + '\'' +
                ", volumeEngine='" + volumeEngine + '\'' +
                ", turbo=" + turbo +
                '}';
    }
}


