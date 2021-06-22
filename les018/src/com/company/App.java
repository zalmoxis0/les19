package com.company;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // 1: We want to manufacure a care and we need all the details
        // 2: Provide customized cars for the clients
        // 3: 3 cars to customise

        // print
        System.out.println("Welcome to Say Jarahis");
        System.out.println("General info");

        Scanner scanner = new Scanner(System.in);

        Car car = new Car();

        System.out.println("Brand: ");
        car.brandName = scanner.nextLine();

        System.out.println("Model: ");
        car.modelName = scanner.nextLine();

        System.out.println("Number of doors: ");
        car.doors = scanner.nextInt();

        System.out.println("Lights: ");
        car.lights = scanner.nextLine();

        System.out.println("Color (R = red, B= Black, Y = Yellow, W = White): ");
        car.color = scanner.next().charAt(0);


        // print

        // cylinderblock
        System.out.println("Cylinder Block ");
        car.cylinderBlock = scanner.nextLine();
        //car.engine.cylinderBlock = scanner.nextLine();

        // cylinder head
        System.out.println("Cylinder Head ");
        car.cylinderHead = scanner.nextLine();

        // oil pan
        System.out.println("Oil Pan ");
        car.oilPan = scanner.nextLine();


        System.out.println("Gps sensors");
        car.sensors.gps = scanner.nextLine();

        System.out.println("Wheel sensors");
        car.sensors.wheel = scanner.nextLine();

        System.out.println("Brake sensors");
        car.sensors.brake = scanner.nextLine();

        System.out.println("Parking sensors");
        car.sensors.parking= scanner.nextLine();

        System.out.println("airbags sensors");
        car.sensors.airbags= scanner.nextLine();

        // sensors

        // break sensors
        String brake;

        // sensors gps
        String gps;

        // sensors wheel
        String wheel;

        // sensors parking
        String parking;

        // sensors airbag
        String airbag;

        // print
        System.out.println("Thank you for choosing our app to customize and " +
                             "order your car");

    }
}
