package org.anandi.SWEN20003.workshops.workshop5.q5;

public class Colour {

    public static final Colour BLACK = new Colour(0, 0, 0);
    public static final Colour WHITE = new Colour(255, 255, 255);

    public final int r;
    public final int g;
    public final int b;

    public Colour(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d, %d)", r, g, b);
    }
}
