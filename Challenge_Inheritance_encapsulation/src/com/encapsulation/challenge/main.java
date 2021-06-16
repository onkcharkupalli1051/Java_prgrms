package com.encapsulation.challenge;

public class main {
    public static void main(String[] args) {
        Printer canon = new Printer(50,0,"duplex");

        canon.fillToner(25);
        canon.printPages(50);

        canon.fillToner(125);
        canon.printPages(250);
    }
}
