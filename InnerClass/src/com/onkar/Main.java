package com.onkar;

public class Main {
    public static void main(String[] args) {
        GearBox mclaren = new GearBox(6);
        GearBox.Gear first = mclaren.new Gear(1,12.3);
        System.out.println(first.driveSpeed(1000));
        GearBox.Gear second = new GearBox.Gear(2,15.4);

    }

}
