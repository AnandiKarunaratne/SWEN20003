package org.anandi.SWEN20003.workshops.workshop2;

import java.util.Objects;

public class Rectangle {

    private double left, top, width, height;

    public Rectangle() {
        this.left = 0;
        this.top = 0;
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        this.left = 0;
        this.top = 0;
    }

    public Rectangle(double left, double top, double width, double height) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return " This Rectangle is at {" +
                "left=" + left +
                ", top=" + top +
                ", with a width of =" + width +
                ", and a height of =" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.left, left) == 0 && Double.compare(rectangle.top, top) == 0 && Double.compare(rectangle.width, width) == 0 && Double.compare(rectangle.height, height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, top, width, height);
    }
}
