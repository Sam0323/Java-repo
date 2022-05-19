//Write a java program that prompts user to input an integer number and your program
//should check given integer is even or odd number.
//Sample output:
//Enter an integer number:10
//Entered number is even
//Enter an integer number:11
//Entered number is odd

package language.basic;

import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int Number1 = Integer.parseInt(scan.nextLine());

        if(Number1 % 2 == 0) {
            System.out.println("Entered number is Even");
        }
        else{
            System.out.println("Entered number is Odd");
        }
    }
}
