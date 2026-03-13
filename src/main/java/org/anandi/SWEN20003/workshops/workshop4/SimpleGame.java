package org.anandi.SWEN20003.workshops.workshop4;

import bagel.*;
import bagel.util.Point;

public class SimpleGame extends AbstractGame {

    private final Image playerImage = new Image("res/player.png");
    private final Image ballImage = new Image("res/ball.png");
    private final Font font = new Font("res/connformable.otf", 24);

    private static final Point BALL_POINT = new Point(650, 180);
    private static final Point TEXT_POINT = new Point(32, 32);
    private static final double STEP_SIZE = 1;
    private static final double SCORE_DISTANCE = 20;

    private double playerX = 200;
    private double playerY = 350;

    @Override
    protected void update(Input input) {
        if (input.isDown(Keys.LEFT)) {
            playerX -= STEP_SIZE;
        }
        if (input.isDown(Keys.RIGHT)) {
            playerX += STEP_SIZE;
        }
        if (input.isDown(Keys.UP)) {
            playerY -= STEP_SIZE;
        }
        if (input.isDown(Keys.DOWN)) {
            playerY += STEP_SIZE;
        }

        if (input.wasPressed(Keys.ESCAPE)) {
            Window.close();
        }

        if (new Point(playerX, playerY).distanceTo(BALL_POINT) <= SCORE_DISTANCE) {
            font.drawString("Great job!", TEXT_POINT.x, TEXT_POINT.y);
        }
        playerImage.draw(playerX, playerY);
        ballImage.draw(BALL_POINT.x, BALL_POINT.y);
    }

    public static void main(String[] args) {
        new SimpleGame().run();
    }
}
