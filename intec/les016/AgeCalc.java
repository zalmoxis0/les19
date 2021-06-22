package com.company;

import java.util.Scanner;

public class AgeCalc {
    public static void main(String[] args) {

        // PRINT
        System.out.println("Welcome to age calculator");

        // PRINT
        System.out.println("Please enter your age:");



        // INPUT(NUMBER)
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.println("your age is " + age);
        // age variable and calculation
        boolean conditionAge18 = (age <= 18 && age >= 0);
        boolean conditionAgeMature = (age >= 18);
        // boolean conditionAgeInvalid= (age >= 18);

        // if statements for mature
        if (conditionAgeMature){
            System.out.println("You are mature with the age of " + age);
        }

        // else if child
        else if( conditionAge18){
            System.out.println("You are a child with the age of " + age);
        }

        // else statement for incorrect value
        else {
            System.out.println("invalid " + age);
        }

    }
}
