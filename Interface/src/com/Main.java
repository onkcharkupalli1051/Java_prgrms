package com;

public class Main {
    public static void main(String[] args) {
        ITelephone realme;
        realme = new DeskPhone(7385);
        realme.callPhone(782202);
        realme.answer();

        realme = new MobilePhone(435435);
        realme.callPhone(782202);
        realme.answer();
    }
}
