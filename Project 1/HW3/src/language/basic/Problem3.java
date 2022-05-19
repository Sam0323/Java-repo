//Write a java program that prompts user to input an integer number and your program should
//check factorial of a number. For example, factorial of 5 is 5*4*3*2*1 which is 120.
//Sample output:
//Enter an integer number:
//5
//Factorial of 5 is 120

package language.basic;

import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int number;
            System.out.print("Enter an integer number: ");
            number = Integer.parseInt(scan.nextLine());

            int factorial = 1;
            for(int i=1; i<=number; i++) {
                factorial = factorial * i;
            }
            System.out.print("Factorial of "+number+ " is " + factorial);
    }
}
