import java.util.Scanner;

public class MeetingInfo {

    public static void main(String[] args) {

        // PRINT
        System.out.println("Welcome to Meeting Reactions Generator..");

        // PRINT
        System.out.println("Please select a number:");

        // INPUT(NUMBER)
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        boolean condition13 = (number == 13);
        boolean condition3 = (number == 3);
        boolean condition40 = (number == 40);
        boolean condition20 = (number == 20);
        boolean condition8 = (number == 8);
        boolean condition5 = (number == 5);
        boolean condition666 = (number == 666);
        boolean conditionMinus666 = (number == -666);
        boolean condition999 = (number == 999);
        boolean condition1 = (number == 1);
        boolean condition2 = (number == 2);
        boolean condition100 = (number==100);

        // IF
        if (condition13) {
            System.out.println("Task is quite medium");
        }

        else if (condition3) {
            System.out.println("Task is small");
        }

        else if (condition40) {
            System.out.println("Task is big");
        }

        else if (condition20) {
            System.out.println("Task is big");
        }

        else if (condition8) {
            System.out.println("Task is medium");
        }

        else if (condition5) {
            System.out.println("Task is vrij klein");
        }

        else if (condition666) {
            System.out.println("Welcome to the first right choice.. ");
        }

        else if (conditionMinus666) {
            System.out.println("This is doable");
        }

        else if (condition999) {
            System.out.println("That is very costly process");
        }

        else if (condition666) {
            System.out.println("This is evil ");
        }

        else if (condition1) {
            System.out.println("My task is tiny");
        }

        else if (condition2) {
            System.out.println("My task is too tiny");
        }

        else if (condition666) {
            System.out.println("This is evil ");
        }

        else if (condition100){
            System.out.println("Taak is super groot");
        }

        else if(condition3){
            System.out.println("That's weird..");
        }

        else if (condition666) {
            System.out.println("This is evil ");
        }

        // ELSE
        else {
            System.out.println("Sorry: Non of these number is chosen ...");
        }


        // to continue your work after if else code block ..

        System.out.println("Thank you for choosing our app..");


    }

}
