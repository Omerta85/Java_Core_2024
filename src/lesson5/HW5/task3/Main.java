package lesson5.HW5.task3;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Створення водіїв
        List<Driver> drivers = new ArrayList<>();
        drivers.add(new Driver("Vova", 30, 8));
        drivers.add(new Driver("Mariya", 26, 4));
        drivers.add(new Driver("Myroslav", 35, 12));
        drivers.add(new Driver("Katya", 28, 6));
        drivers.add(new Driver("Andriy", 22, 2));
        drivers.add(new Driver("Anna", 40, 15));
        drivers.add(new Driver("Sasha", 25, 3));

        // Створення автомобілів
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", 150, drivers.get(0), 25000, 2020));
        cars.add(new Car("Honda", 120, drivers.get(1), 20000, 2018));
        cars.add(new Car("Ford", 180, drivers.get(2), 30000, 2019));
        cars.add(new Car("BMW", 200, drivers.get(3), 40000, 2021));
        cars.add(new Car("Mercedes", 250, drivers.get(4), 50000, 2022));
        cars.add(new Car("Audi", 180, drivers.get(5), 35000, 2020));
        cars.add(new Car("Volkswagen", 160, drivers.get(6), 28000, 2017));

        // Ремонт мотора для половини автомобілів
        cars.stream()
                .limit(cars.size() / 2)
                .forEach(Car::increaseEnginePower);
        System.out.println("\nCars after engine repair:");
        cars.forEach(car -> System.out.println(car.getBrand() + " - Engine Power: " + car.getEnginePower() + " HP"));

        // Перевірка досвіду водіїв та відправлення на курси
        List<Driver> driversForCourses = drivers.stream()
                .filter(driver -> driver.getDrivingExperience() < 5 && driver.getAge() > 25)
                .peek(Driver::increaseDrivingExperience)
                .collect(Collectors.toList());

// Виведення інформації про водіїв, які пішли на курси
        System.out.println("\nDrivers sent for training courses:");
        driversForCourses.forEach(driver -> System.out.println(driver.getName() + " - Experience: " + driver.getDrivingExperience() + " years"));



        // Порахувати суму для покупки всіх автомобілів
        double totalCost = cars.stream()
                .mapToDouble(Car::getPrice)
                .sum();

        System.out.println("Total cost for buying all cars: $" + totalCost);
    }
}
