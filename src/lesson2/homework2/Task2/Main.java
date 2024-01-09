package lesson2.homework2.Task2;

public class Main {
    public static void main (String[] args){
        Ultrabook ultrabook = new Ultrabook("Dell", "XPS", 2022, 13.3, 12, true);
        Workstation workstation = new Workstation("HP", "ZBook", 2022, 15.6, 8, true, "NVIDIA Quadro");

        System.out.println("Ultrabook details: " + ultrabook);
        System.out.println("Workstation details: " + workstation);
    }
}
