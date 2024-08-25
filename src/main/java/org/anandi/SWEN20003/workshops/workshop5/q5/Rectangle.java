package org.anandi.SWEN20003.workshops.workshop5.q5;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height, Colour colour) {
        super(colour, "Rectangle");
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
