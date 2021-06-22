package com.company;

public class AppException {
    public static void main(String[] args) {
       // Classname variableName = new Classname();
        // varName = new Classname();

        Car car = new Car();
        System.out.println("Car is " + car);
        System.out.println("Car is " + car.engine);
        System.out.println("Car is " + car.sensors);
        System.out.println("Car is " + car.engine.cylinderHead);
        System.out.println("Car is " + car.doors);
        System.out.println("Car is " + car.color);

        // JVM Cache: Voor elke variabel is er een levensspan
    }
}
