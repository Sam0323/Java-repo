//A year with 366 days is called a leap year. A year is a leap year if it is divisible by 4 (for
//e.g., 1980), except that it is not a leap year if it is also divisible by 100 (for e.g., 1900);
//however, it is a leap year if it is further divisible by 400 (for e.g., 2000).
//Write a program that prompts the user to enter a year and displays whether that year is
//a leap year. The program should repeatedly prompt the user for a year until the user
//enters  a  sentinel  value  of  -99  to  quit  the  program.  Note  that  you  will  need  to  use
//the mod function (%) to determine divisibility by a number. You CANNOT use the class
//GregorianCalendar and any of its methods. 

package language.basic;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag=true;
        boolean leap = false;
        int year;

        while(flag){

            System.out.print("Enter year: ");
            year=sc.nextInt();

            if(year!=-99){

                if (year % 4 == 0)    //if Year divisible by 4
                {
                    if (year % 100 == 0)     //if Year divisible by 100
                    {
                        if (year % 400 == 0)  // If year divided by 400
                            leap = true;        // Then leap year because divisible by 4,100 and 400
                        else
                            leap = false;       // Else not a leap year
                    }
                    else
                        leap = true;      //  if only divisible by 4 not 100 & 400 then leap year
                }
                else
                    leap = false;   // Not divisible by 4 also then not leap year

                if (leap)
                    System.out.println(year + " is a leap year.\n");
                else
                    System.out.println(year + " is not a leap year.\n");
            }
            else
                flag=false;



        }
    }
}
