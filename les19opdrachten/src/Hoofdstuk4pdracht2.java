import java.util.Random;
import java.util.Scanner;

public class Hoofdstuk4pdracht2 {
    public static void main(String[] args) {

        // scanner variable
        var scanner = new Scanner(System.in);

        // scanner object: random number
        int attemtptsNum = 0;

        // attempts to guess variable
        final int maxAttempts = 3;

        // variable user
        int user;


// initialise scanner

        // print


        // variable random number
        var random = new Random();

        // initialise the random number input

        // scanner number registration 1 between 100
        var numberToGuess = random.nextInt(100);

        // print
        System.out.println("Welcome to the random number guesser ");

        //print
        System.out.println("Type a number to start the game");

        // print        var guess = scanner.nextInt();
        var guess = scanner.nextInt();

        // print
        System.out.println("Guess a number between 1 to 100 ");



        // start do conditions
        do {
            // scanner
            Scanner input = new Scanner(System.in);

            // scanner initialise user variable
            user = input.nextInt();

            // else-if conition for user and numberToGuess user
            if (user > numberToGuess)
                System.out.println("Number is less than " + user + ".");
            else if (user < numberToGuess)
                System.out.println("Number is greater than " + user + ".");
            else
                System.out.println("Correct " + numberToGuess + "was my number");

            // if condition : guessed number smaller than number to guess
            if (guess < numberToGuess) {

                // print
                System.out.println("Higher");

                // else condition
            } else {

                // if condition : guessed number greater than number to guess
                if (guess > numberToGuess) {

                    // print
                    System.out.println("Lower!");
                }
                // else condition
                else {

                    // print guessed if condition guessed = true
                    System.out.println("Guessed");

                    // guessed variable boolean true
                    //guessed = true;
                }

            }
        }

        // while condition: if guessed number is not equal to number
        // to guess and attempts to guess is less than max attempts (3)
        // count +1, until 3 attempts then end.
        while (user != numberToGuess && ++attemtptsNum < maxAttempts);

        // if attemptsnum == maxatempts condition
        if (attemtptsNum == maxAttempts)
            System.out.println("You loose. The number was: " + numberToGuess);
        // if var

        // while not guessed, go to next try


        // close scanner.
        scanner.close();

    }

}



