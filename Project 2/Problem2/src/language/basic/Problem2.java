//Write a java program to print student’s total marks, percentage and grade. User input is
//given to enter number of subjects and then prompts user to enter marks. Calculate Total
//marks, Student Percentage, Student Grade.
//
//Note:
//1. Maximum marks for a subject is 100.
//2. percentage = (totalMarks/(count*100)) * 100;
//>=90 is Grade A
//>=80 and <=89.99 is Grade B
//>=70 and <=79.99 is Grade C
//>=60 and <=69.99 is Grade D
//< 60 is Fail
//
//Tips: use scanner for inputs, use for loop (to iterate and store marks), use switch statement
//(to print grades).
//
//Sample Output:
//Enter Number of Subject(s):
//3
//Enter Marks of 3 Subject(s):
//70
//80
//90
//Total Marks : 240
//Student Percentage: 80
//Student Grade : B 


package language.basic;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        int subjects,i;
        float Total= 0,percentage,sub;
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Enter Number of Subject(s):");
        subjects = scanner.nextInt();
        System.out.println("Enter marks of "+subjects+" Subject(s):");
        for (i = 0; i < subjects; i++) {
            sub = scanner.nextInt();
            Total += sub;
        }
        System.out.println("Total Marks : " + Total);
        percentage = (Total / (subjects * 100)) * 100;
        System.out.println("Student Percentage: "+percentage);
        switch ((int) percentage / 10) {
            case 9:
                System.out.println("Student Grade : A");
                break;
            case 8:
                System.out.println("Student Grade : B");
                break;
            case 7:
                System.out.println("Student Grade : C");
                break;
            case 6:
                System.out.println("Student Grade : D");
                break;
            default:
                System.out.println("Fail!");
                break;
        }

    }
}