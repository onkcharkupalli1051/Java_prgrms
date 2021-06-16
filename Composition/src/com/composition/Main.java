package com.composition;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B","Dell","240",dimensions);

        Monitor theMonitor = new Monitor("27 beast","Acer",27, new Resolution(2540,1440));
        Motherboard theMotherboard = new Motherboard("Bj","Asus",4,6,"v2");

        PC thePc = new PC(theCase,theMonitor,theMotherboard);
        thePc.powerUp();
    }
}
