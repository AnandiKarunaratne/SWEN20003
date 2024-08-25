package org.anandi.SWEN20003.workshops.workshop5.q2;

public abstract class Shape {

    public final double x;
    public final double y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    abstract double getArea();

    abstract double getPerimeter();

    public String toString() {
        return "Plain Shape";
    }

}
