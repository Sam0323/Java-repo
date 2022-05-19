//Write a class called Rectangle that maintains two attributes to represent the length and
//width of a rectangle. Provide suitable get and set methods plus two methods that return
//the perimeter and area of the rectangle. Include two constructors for this class. One a
//parameterless constructor that initializes both the length and width to 0, and the second
//one that takes two parameters to initialize the length and width.
//
//2. Write a java program (a driver application) that tests the above class by providing the
//users with the following Console based menu options:
//
//1 - to set the length
//2 - to set the width
//3 - to get the length
//4 - to get the width
//5 - to get the perimeter
//6 - to get the area
//0 - to quit
//
//Your program should create one Rectangle object at the beginning using the default
//constructor, and then repeatedly call the appropriate method for that object depending on
//the user inputs from the above menu. Use Command Line Interface or Console for all
//input/output. 


package language.basic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //creating Rectangle Object
        Rectangle r = new Rectangle();

        //loop runs until user enters 0 to quit
        while(true)
        {

            System.out.println("1 - to set the length\n2 - to set the width\n3 - to get the length");
            System.out.println("4 - to get the width\n5 - to get the perimeter\n6 - to get the area\n0 - to quit\n");

            // Taking data from user
            int choice = sc.nextInt();
            int length,width;
            if(choice == 0)
                break;

            //using switch case
            switch(choice)
            {
                case 1: System.out.print("\nEnter length: ");
                    length = sc.nextInt();
                    r.setLength(length);
                    break;
                case 2: System.out.print("\nEnter width: ");
                    width = sc.nextInt();
                    r.setWidth(width);
                    break;
                case 3: System.out.println("\nThe length is: "+r.getLength());
                    break;

                case 4: System.out.println("\nThe width is: "+r.getWidth());
                    break;
                case 5: System.out.println("\nThe perimeter is: "+r.getPerimeter());
                    break;
                case 6: System.out.println("\nThe area is: "+r.getArea());
                    break;
                default:
                    System.out.println("\nInvalid input.");
                    break;
            }
        }
    }
}
