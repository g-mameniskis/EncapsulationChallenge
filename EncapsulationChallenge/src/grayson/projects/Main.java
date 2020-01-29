package grayson.projects;

import java.lang.ref.PhantomReference;

public class Main {

    public static void main(String[] args) {

        Printer thePrinter = new Printer(49,false);

        System.out.println("Initial page count = " + thePrinter.getNumberOfPagesPrinted());
        int pagesPrinted = thePrinter.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count = " + thePrinter.getNumberOfPagesPrinted());
        thePrinter.fillToner(50);
        thePrinter.getNumberOfPagesPrinted();
        pagesPrinted = thePrinter.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count = " + thePrinter.getNumberOfPagesPrinted());
    }
}
