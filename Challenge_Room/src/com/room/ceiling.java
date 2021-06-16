package com.room;

public class ceiling {
    private int length, breadth;
    private String color;

    public ceiling(int length, int breadth, String color) {
        this.length = length;
        this.breadth = breadth;
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public String getColor() {
        return color;
    }
}
