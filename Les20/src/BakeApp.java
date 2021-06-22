import java.util.Scanner;

public class BakeApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

// PRINT
        System.out.println("Welcome to Bake App..");


        System.out.println("Would you like to start baking? ");

// PRINT
        System.out.println("Enter the amount flour (GR): ");



// INPUT(FLOUR_AMOUNT_IN_GRAMS)
        double flour = scanner.nextDouble();

        System.out.println("Enter the amount milk (GR): ");
        double milk = scanner.nextDouble();

        System.out.println("Enter the amount eggs (GR): ");
        double eggs = scanner.nextDouble();

        System.out.println("Now mix ");
        double mix = scanner.nextDouble();
        scanner.nextLine();

        String answer = scanner.nextLine();
        boolean condition = answer=="y";
        if (condition)
            System.out.println("you've added the " + " flour " +flour
                    + " milk " + milk + " eggs " + eggs);
        // else condition





// PRINT : Would you like to start baking (y/n)?





// INPUT(ANSWER)



// IF -> PARENT NODE
// FOR(10) -> CHILD NODE
// PRINT -> CHILD NODE



// ELSE -> PARENT NODE
// PRINT -> CHILD NODE




// PRINT
        System.out.println("Thank you for choosing our app..");    }
}
