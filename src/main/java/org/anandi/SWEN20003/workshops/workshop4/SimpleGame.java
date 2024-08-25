package org.anandi.SWEN20003.workshops.workshop4;

import bagel.*;
import bagel.util.Point;

public class SimpleGame extends AbstractGame {

    private final Image playerImage = new Image("res/player.png");
    private final Image ballImage = new Image("res/ball.png");
    private final Font font = new Font("res/conformable.otf", 24);

<<<<<<< Updated upstream
    private static final Point BALL_POSITION = new Point(650, 180);
    private static final double STEP_SIZE = 1;
    private static final double SCORE_DISTANCE = 20;
    private static final Point TEXT_POSITION = new Point(32, 32);
=======
    private static final double STEP_SIZE = 1;
    private static final Point BALL_POINT = new Point(650, 180);
    private static final Point TEXT_POINT = new Point(32, 32);
    private static final double SCORE_DISTANCE = 20;
>>>>>>> Stashed changes

    private double playerX = 200;
    private double playerY = 350;

    @Override
    protected void update(Input input) {
<<<<<<< Updated upstream
        if (input.wasPressed(Keys.ESCAPE)) {
            Window.close();
        } else {
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

            ballImage.draw(BALL_POSITION.x, BALL_POSITION.y);
            playerImage.draw(playerX, playerY);

            if (new Point(playerX, playerY).distanceTo(BALL_POSITION) <= SCORE_DISTANCE) {
                font.drawString("Great job!", TEXT_POSITION.x, TEXT_POSITION.y);
            }
        }
=======
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

        if (new Point(playerX, playerY).distanceTo(BALL_POINT) <= SCORE_DISTANCE) {
            font.drawString("Great job!", TEXT_POINT.x, TEXT_POINT.y);
        }
        ballImage.draw(BALL_POINT.x, BALL_POINT.y);
        playerImage.draw(playerX, playerY);
>>>>>>> Stashed changes
    }

    public static void main(String[] args) {
        new SimpleGame().run();
    }
}
