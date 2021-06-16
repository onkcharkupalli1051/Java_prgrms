package com.timbuchalka;

public class car extends vehicle{
    private int doors;

    public car(int wheels, int engine, boolean abs, int doors) {
        super(wheels, engine, abs);
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void steer(){
        System.out.println("Steering");
    }
}
