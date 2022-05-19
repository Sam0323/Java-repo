//Create a Class and demonstrate proper encapsulation technique.
// The class will be called Printer
// It will simulate a real computer Printer
// It should have fields for the toner level, number of pages printed and whether it is a duplex
//printer (capable of printing on both the sides of the paper)
// Add methods to fill up the toner (up to maximum of 100%), another method to simulate printing
//a page (which should increase the number of pages printed)
// Decide on the scope, whether to use constructors, and anything else you think is needed.
//Finally, create Main Class to run the program.
//Sample Output:
//Initial page count = 0
//Pages printed was 8 new total print count for printer = 8
//Pages printed was 2 new total print count for printer = 10


package language.basic;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(false);

        System.out.println("Initial page count = " + printer.getNumberOfPages());

        printer.printPages(8);
        System.out.println("Pages printed was 8 new total print count for printer = " + printer.getNumberOfPages());

        printer.printPages(2);
        System.out.println("Pages printed was 2 new total print count for printer = " + printer.getNumberOfPages());
    }
}
