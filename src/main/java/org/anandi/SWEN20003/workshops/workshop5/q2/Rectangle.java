package org.anandi.SWEN20003.workshops.workshop5.q2;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle with width = " + width + " and height = " + height + ".";
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
