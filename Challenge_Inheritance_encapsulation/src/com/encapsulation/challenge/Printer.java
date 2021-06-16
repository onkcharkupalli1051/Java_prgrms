package com.encapsulation.challenge;

public class Printer {
    private int tonerLevel = 0, printedPages = 0;
    private String type;

    public Printer(int tonerLevel, int printedPages, String type) {
        this.tonerLevel = tonerLevel;
        this.printedPages = printedPages;
        this.type = type;
    }

    public void fillToner(int ink){
        while(tonerLevel < 100 && ink>0){
            tonerLevel += 1;
            ink--;
        }
        System.out.println("Filled toner upto = "+tonerLevel);
    }

    public void printPages(int numberOfPages){
        System.out.println("Printing "+numberOfPages+" pages.");
        printedPages += numberOfPages;
    }
}
