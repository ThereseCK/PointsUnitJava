package com.jetbrains;

public class Point {
    private int x;
    private int y;

    // constructs a new point at the origin (0,0)
    public Point(){
        this(0,0);
    }

    //constructor a new point the given (x, y) location
    public Point(int x, int y){
        setLocation(x, y);
    }

    // return the x-coordinate of this point
    public int getX(int x){
        return x;
    }

    // return the y-coordinate of this point
    public int getY(int y){
        return y;
    }

    // sets this point's (x, y) location to the given values
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // return a String reprentastion of this Point
    public String toString(){
        return "(" + x + ", " + y + ")";
    }

    // returns the distance between this point and (0, 0)
    public double distanceFromOrigin(){
        return Math.sqrt(x *x + y * y);
    }

    // shifts this point's location by the given amount
    public void translate(int dx, int dy){
        setLocation( x + dx, y + dy);
    }
}

