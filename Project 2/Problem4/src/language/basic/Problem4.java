//Write a do-while loop that asks the user to enter two numbers. The numbers
//should be added and the sum displayed. The loop should ask the user whether
//he or she wishes to perform the operation again. If so, the loop should repeat;
//otherwise it should terminate.
//Sample output:
// Enter the first number 1
//Enter the second number 2
//Sum of numbers: 3
//Do you want to continue y/n? y
//Enter the first number 1
//Enter the second number 3
//Sum of numbers: 4
//Do you want to continue y/n? n


package language.basic;// Import Scanner class to take user input
import java.util.Scanner;

// Create a Main class
public class Problem4 {
    // Main method
    public static void main(String[] args)
    {
        // Create an object of Scanner class
        Scanner scan = new Scanner(System.in);

        // Used to store user choice
        char choice;

        // Loop until user does not want to continue
        do
        {
            // Take first number
            System.out.print("Enter the first number: ");
            int n1 = scan.nextInt();

            // Take second number
            System.out.print("Enter the second number: ");
            int n2 = scan.nextInt();

            // Find the sum of both numbers
            int sum = n1 + n2;

            // Print the sum of numbers
            System.out.println("Sum of numbers: " + sum);

            // Take user choice to continue
            System.out.print("Do you want to continue y/n? ");
            choice = scan.next().charAt(0);

        }while(choice != 'n');

    }
}
