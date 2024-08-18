package org.anandi.SWEN20003.workshops.workshop2;

import java.util.Objects;

public class Circle {

    private double radius, x, y;

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

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 && Double.compare(circle.x, x) == 0 && Double.compare(circle.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, x, y);
    }
}
