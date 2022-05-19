//1. Write a java program that prompts the user to enter first name, last name and age for two
//persons. You should store the names in String variables and the ages in int variables.
//Your program should compare the two ages and print out the information in the following
//format (Note that Smith and Doe are the last names in the examples shown below):
//
//Sample output:
//First Person: Smith, John (31)
//Second Person: Doe, Mike (35)
//Smith is younger than Doe
//or
//First Person: Doe, John (31)
//Second Person: Smith, Mike (31)
//Doe is of same age as Smith
//or
//First Person: Doe, John (35)
//Second Person: Smith, Mike (31)
//Doe is older than Smith

package language.basic;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);//Gets input from scan and gets input from console

        System.out.println("Enter users 1 First name:");
        String Name1 = scan.nextLine();

        System.out.println("Enter users 1 Last name:");
        String Last1 = scan.nextLine();

        System.out.println("Enter users 2 First name:");
        String Name2 = scan.nextLine();

        System.out.println("Enter users 2 Last name:");
        String Last2 = scan.nextLine();

        System.out.println("Enter users 1 age:");
        int Age1 = Integer.parseInt(scan.nextLine());

        System.out.println("Enter user 2 age:");
        int Age2 = Integer.parseInt(scan.nextLine());

        System.out.println("Person 1 name is: " + Last1 + ", " + Name1 + "(" + Age1 + ")");
        System.out.println("Person 2 name is: " + Last2 + ", " + Name2 + "( " + Age2 + ")");

        if (Age1 < Age2) {
            System.out.println(Last1 + " is younger than " + Last2);
        } else if (Age1 > Age2) {
            System.out.println(Last2 + " is younger than " + Last1);
        } else {
            System.out.println(Last1 + " is same age as " + Last2);
        }

    }
}
