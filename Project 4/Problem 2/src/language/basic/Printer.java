package language.basic;
import javax.naming.OperationNotSupportedException;

public class Printer {
    private int tonerLevel;
    private int numberOfPages;
    private boolean duplex;

    public Printer(boolean duplex) {
        fillToner();
        numberOfPages = 0;
        this.duplex = duplex;
    }

    public void fillToner() {
        tonerLevel = 100;
    }

    public void printPages(int pages) {
        if (tonerLevel - pages >= 0) {
            numberOfPages += pages;
            tonerLevel -= pages;
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void printDualSidePages(int pages) throws OperationNotSupportedException {
        if (isDuplex()) {
            if (tonerLevel - pages >= 0) {
                numberOfPages += 2 * pages;
                tonerLevel -= pages;
            }
        }
        else {
            throw new OperationNotSupportedException("Can't print both sides since is not a duplex printer");
        }
    }

    public boolean isDuplex() {
        return duplex;
    }
}
