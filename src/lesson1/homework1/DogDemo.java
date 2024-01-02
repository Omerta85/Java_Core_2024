package lesson1.homework1;

public class DogDemo {
    public static void main(String[] args){

        Dog dog1 = new Dog("Rex", "German Shepherd", 3);
        Dog dog2 = new Dog("Bella", "Labrador Retriever", 2);
        Dog dog3 = new Dog("Luna", "Husky", 4);
        Dog dog4 = new Dog("Max", "Beagle", 1);
        Dog dog5 = new Dog("Charlie", "Poodle", 5);
        // Покласти об'єкти в масиви
        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};
        // Проітерувати та вивести в консоль
        System.out.println("Dogs:");
        for (Dog dog : dogs) {
            System.out.println(dog);
        }

    }
}
