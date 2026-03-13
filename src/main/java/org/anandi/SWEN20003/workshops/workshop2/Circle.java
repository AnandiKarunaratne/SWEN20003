package org.anandi.SWEN20003.workshops.workshop2;

public class Circle {

    private double radius;
    private double x;
    private double y;

    public Circle() {
        this.radius = 1;
        this.x = 0;
        this.y = 0;
    }

    public Circle(double radius) {
        this.radius = radius;
        this.x = 0;
        this.y = 0;
    }

    public Circle(double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "This circle has a radius of " + radius + " and is at (" + x + ", " + y + ").";
    }

    public boolean equals(Circle otherCircle) {
        return (this.radius == otherCircle.radius) &&
                (this.x == otherCircle.x) &&
                (this.y == otherCircle.y);
    }
}
