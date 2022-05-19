//Create a class Student and declare variables stdName, stdRollNo, and stdId as private.
//Step 1. Declare variables as private in the class.
//Step 2. Apply public getter method for each private variable in the class.
//Step 3. Apply public setter method for each private variable in the class.
//Step 4. Create the object of class student by using new keyword.
//Step 5. Call setter method and set the variables.
//Step 6. Call getter method to read the Value of variables and print it on console.
//
//Sample output:
// Students name: Kiran
// Students Roll no : 4
// Students ID : 12345 

package language.basic;

public class Main {


    private String stdName;

    private int stdRollNo, stdId;

    public void setName(String name) {
        this.stdName = name;
    }

    public String getName() {
        return this.stdName;
    }
    public void setRoll(int roll) {
        this.stdRollNo = roll;
    }

    public int getRoll() {
        return this.stdRollNo;
    }
    public void setId(int id) {
        this.stdId = id;
    }

    public int getId() {
        return this.stdId;
    }

    public static void main(String[] args) {

        Main student = new Main();
        student.setName("Kiran");
        student.setRoll(4);
        student.setId(12345);

        System.out.println("Students name: "+student.getName());
        System.out.println("Students Roll no: "+student.getRoll());
        System.out.println("Students ID: "+student.getId());
	
    }
}
