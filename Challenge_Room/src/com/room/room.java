package com.room;

public class room {
    private bed thebed;
    private cupBoard theCupBoard;
    private wall wall1;
    private wall wall2;
    private wall wall3;
    private wall wall4;
    private ceiling theCeiling;

    public room(bed thebed, cupBoard theCupBoard, wall wall1, wall wall2, wall wall3, wall wall4, ceiling theCeiling) {
        this.thebed = thebed;
        this.theCupBoard = theCupBoard;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.theCeiling = theCeiling;
    }

    public cupBoard getTheCupBoard(){
        return this.theCupBoard;
    }

    public void makeBed() {
        System.out.println("making bed.");
    }

    public wall getWall1() {
        return wall1;
    }

    public wall getWall2() {
        return wall2;
    }

    public wall getWall3() {
        return wall3;
    }

    public wall getWall4() {
        return wall4;
    }

    public ceiling getTheCeiling() {
        return theCeiling;
    }
}
