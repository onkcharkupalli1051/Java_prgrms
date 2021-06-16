package com.challenge.polymorphism;

class Car{
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public void startEngine(){
        System.out.println("Engine Starting...");
    }

    public void accelerate(){
        System.out.println("Accelerating...");
    }

    public void brake(){
        System.out.println("Brakes Applied");;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }
}

class Audi extends Car{
    public Audi(int cylinders) {
        super(cylinders, "Audi");
    }

    public void accelerate(){
        System.out.println("Entering Virat Kohli Mode");
    }

    public void brake(){
        System.out.println("Showa Caliper Braking");
    }
}

class Mercedes extends Car{
    public Mercedes(int cylinders) {
        super(cylinders, "Mercedes");
    }

    @Override
    public void accelerate() {
        super.accelerate();
        System.out.println("Sriman bhai : Wassup guys, hows the speed?");
    }

    @Override
    public void brake() {
        super.brake();
        System.out.println("Sriman bhai : brakes are super duper responsive");
    }
}

class Mustang extends Car{
    public Mustang(int cylinders) {
        super(cylinders, "Mustang");
    }

    @Override
    public void accelerate() {
        System.out.println("Baba Yaga accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Baba Yaga won't stop today");
    }
}

public class main {
    public static void main(String[] args) {
        Car unknown = new Car(4,"unknown");
        unknown.accelerate();
        unknown.brake();

        Audi vk = new Audi(12);
        vk.accelerate();
        vk.brake();

        Mercedes sk = new Mercedes(12);
        sk.accelerate();
        sk.brake();

        Mustang jw = new Mustang(8);
        jw.accelerate();
        jw.brake();
    }
}
