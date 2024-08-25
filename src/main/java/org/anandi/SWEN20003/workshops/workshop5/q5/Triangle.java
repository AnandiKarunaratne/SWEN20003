package org.anandi.SWEN20003.workshops.workshop5.q5;

public class Triangle extends Shape {

    private final double base;
    private final double height;

    public Triangle(double base, double height, Colour colour) {
        super(colour, "Triangle");
        this.base = base;
        this.height = height;
    }

    public Triangle(double base, double height) {
        super("Triangle");
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 1 / 2.0 * base * height;
    }
}
