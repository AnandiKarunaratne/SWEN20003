package org.anandi.SWEN20003.workshops.workshop5.q5;

public abstract class Shape {

    private final Colour colour;
    private final String name;

    public Shape(Colour colour, String name) {
        this.colour = colour;
        this.name = name;
    }

    public Shape(String name) {
        this.name = name;
        this.colour = Colour.BLACK;
    }

    public abstract double getArea();

    public void render() {
        System.out.format("Drawing a %s with colour:%s and area: %.2fpx2\n",
                name, colour, getArea());
    }

}
