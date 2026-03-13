package org.anandi.SWEN20003.workshops.workshop8;

public class Rectangle<T extends Number> {

    private final Pair<T, T> topLeft;
    private final Pair<T, T> bottomRight;

    public Rectangle(Pair<T, T> topLeft, Pair<T, T> bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }
}
