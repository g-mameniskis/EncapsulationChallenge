package grayson.projects;

public class Printer {

    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.numberOfPagesPrinted = 0;
        this.duplexPrinter = duplexPrinter;
    }

    public int fillToner(int toner) {
        if (toner > 0 && toner <= 100) {
            if (this.tonerLevel + toner > 100) {
                System.out.println("That's too much toner!");
                return -1;
            }
            this.tonerLevel += toner;
            System.out.println("Printer toner level is " + tonerLevel + "%");
            return this.tonerLevel;
        } else {
            System.out.println("Invalid toner level");
            return -1;
        }
    }

    public int printPages(int pagesPrinted) {
        int pagesToPrint = pagesPrinted;
        if (this.duplexPrinter) {
            pagesToPrint = (pagesPrinted / 2) + (pagesPrinted % 2);
            System.out.println("Duplex mode: printing " + pagesToPrint + " pages");
        }
        this.numberOfPagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }
}
