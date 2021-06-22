import java.util.Scanner;

public class Hoofsdtuk4pdracht1 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);


        //input
        System.out.println("Enter a number:");
        var number1 = scanner.nextInt();


        // input
        System.out.println("Enter a number: ");
        var number2 = scanner.nextInt();

        var sum = number1 + number2;

        // output
        System.out.println("The sum is "  + sum);

        // close scanner
        scanner.close();
    }
}
