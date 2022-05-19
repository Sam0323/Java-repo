//A  Palindrome  is  a  word  (or  a  number)  that  reads  the  same  backwards.  In  this  assignment
//you will be writing a program that repeatedly prompts a user for a positive integer number
//and  tests  whether  the  number  is  a  palindrome.  Your  program  should  convert  the  integer
//value given by the user into an int array storing each digit of the number in the appropriate
//element  of  the  array.  It  should  then  check  to  see  whether  the  array  is  a  palindrome.  Your
//program should follow the guidelines given below.
//1. Write a method called getSize( int num ) that takes an integer number as input
//argument and returns the number of digits in that number. For e.g., getSize( 234 ) should
//return 3 and getSize( 76 ) should return 2.
//2. Write a method called fillArray( int num, int[] intArray ) that takes an integer
//number and an integer array argument and fills the array with the appropriate digits of the
//number. For e.g., calling the above method fillArray( 87432, intArray ) would
//set intArray[0] to the value 8, intArray[1] to 7, ..., and intArray[4] to 2.
//3. Write a boolean method called isPalindrome( int[] intArray ) that takes an integer
//array argument and returns the value true if the array is a palindrome else returns false.
//4. Finally, write the main method that prompts the user repeatedly for an integer number,
//uses the getSize method to find out the number of digits in that number, allocates
//the intArray for that size, calls the method fillArray to populate the array with the digits
//of the number, calls the isPalindrome method to find out whether the array is a
//palindrome, and prints out the result. Your program should terminate when the user enters
//-99.
//Notes:
//In Java you can allocate an array using a variable for the size, i.e., int[] intArray = new
//int[size]; where size is an int variable.
//You should use Command Line Interface or Console for all input/output.

package language.basic;

import java.util.Scanner;

class Palindrome
{
    static int getSize(int num)
    {
        int count=0;
        while(num>0)
        {
            count++;
            num=num/10;
        }
        return count;
    }
    static void fillArray(int num, int [] intArray)
    {
        int l=intArray.length;
        for(int i=0;i<l;i++)
        {
            intArray[i]=num%10;
            num=num/10;
        }
    }
    static boolean isPalindrome(int [] intArray)
    {
        int i,l=intArray.length;
        boolean match=false;
        for(i=0;i<=l/2;i++)
        {
            if(intArray[i]==intArray[l-i-1])
            {
                match=true;
            }
            else
            {
                match=false;
                break;
            }
        }
        return match;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,size;
        boolean result;
        do
        {
            System.out.print("Enter an integer number, -99 to exit : ");
            n=sc.nextInt();
            if(n==-99)
            {
                break;
            }
            size=getSize(n);
            int[] intArray=new int[size];
            fillArray(n,intArray);
            result=isPalindrome(intArray);
            if(result==true)
            {
                System.out.println(n+" is a palindrome.");
            }
            else
            {
                System.out.println(n+" is not a palindrome.");
            }
        }while(n!=-99);
    }
}
