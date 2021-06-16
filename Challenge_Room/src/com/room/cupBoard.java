package com.room;

public class cupBoard {
    private int height;
    private int width;
    private String color;

    public cupBoard(int height, int width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }
}
