package org.anandi.SWEN20003.workshops.workshop5.q2;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();

        Shape[] shapes = new Shape[10];

        for (int i = 0; i < shapes.length; i++) {
            if (rand.nextBoolean()) {
                shapes[i] = new Circle(rand.nextInt(5), rand.nextInt(5), rand.nextInt(5));
            } else {
                shapes[i] = new Rectangle(rand.nextInt(5), rand.nextInt(5), rand.nextInt(5), rand.nextInt(5));
            }
        }

        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }
}
