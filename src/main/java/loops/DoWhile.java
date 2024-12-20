package loops;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner sc = new Scanner(System.in);
        
        int positiveNumber;
        
        // Repeat asking until a positive number is entered
        do {
            System.out.println("Please enter a positive number:");
            positiveNumber = sc.nextInt();
            
            // Check if the entered number is positive
            if (positiveNumber <= 0) {
                System.out.println("That's not a positive number. Try again.");
            }
        } while (positiveNumber <= 0);  // Loop continues until a positive number is entered
        
        // Once a positive number is entered, print it
        System.out.println("You entered the positive number: " + positiveNumber);
    }
}
