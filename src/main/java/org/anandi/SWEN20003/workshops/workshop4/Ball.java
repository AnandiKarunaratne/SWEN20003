package org.anandi.SWEN20003.workshops.workshop4;

import bagel.Image;
import bagel.Window;
import bagel.util.Point;
import bagel.util.Vector2;

public class Ball {

    private final Image ballImage = new Image("res/ball.png");

    private static final double STEP_SIZE = 0.5;

    private double x;
    private double y;
    private double directionX;
    private double directionY;

    public Ball() {
        setRandomPosition();
        setRandomDirection();
    }

    public Point getPosition() {
        return new Point(x, y);
    }

    public void setRandomPosition() {
        x = Math.random() * Window.getWidth();
        y = Math.random() * Window.getHeight();
    }

    private void setRandomDirection() {
        Vector2 d = new Vector2(Math.random(),Math.random());
        directionX = d.normalised().x;
        directionY = d.normalised().y;
    }

    public void update() {
        if (x < 0 || x > Window.getWidth()) {
            directionX *= -1;
        }
        if (y < 0 || y > Window.getHeight()) {
            directionY *= -1;
        }
        x += directionX * STEP_SIZE;
        y += directionY * STEP_SIZE;
        ballImage.draw(x, y);
    }

}
