package com.timbuchalka;

public class vehicle {
    private int wheels;
    private int engine;
    private boolean abs;

    public vehicle(int wheels, int engine, boolean abs) {
        this.wheels = wheels;
        this.engine = engine;
        this.abs = abs;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    public void move(int speed){
        System.out.println("Moving with speed : "+speed);
    }

    public void changeGear(int gear){
        System.out.println("Gear changed to : "+gear);
    }
}
