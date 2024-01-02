package lesson1.homework1;

public class CarDemo {
    public static void main(String[] args){
        // Створення 5 об'єктів кожного класу
        Car car1 = new Car("Skoda fabia", 1000, 1.2, true);
        Car car2 = new Car("Toyota Corolla", 1500, 2.0, false);
        Car car3 = new Car("Ford Mustang", 3000, 6.0, true);
        Car car4 = new Car("BMW X5", 2500, 4.0, true);
        Car car5 = new Car("Honda Civic", 2000, 3.0, false);
        // Покласти об'єкти в масиви
        Car[] cars = {car1, car2, car3, car4, car5};
        // Проітерувати та вивести в консоль
        System.out.println("Cars:");
        for (Car car : cars) {
            System.out.println(car);
        }

    }
}
