package com.room;

public class bed {
    private int height;
    private int width, length;
    private String color;

    public bed(int height, int width, int depth, String color) {
        this.height = height;
        this.width = width;
        this.length = depth;
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return length;
    }

    public String getColor() {
        return color;
    }
}
