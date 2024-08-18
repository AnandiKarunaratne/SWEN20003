package org.anandi.SWEN20003.workshops.workshop4;

import bagel.*;
import bagel.util.Point;

import java.text.DecimalFormat;

public class AutoGame extends AbstractGame {

    private final Image playerImage = new Image("res/player.png");
    private final Image ballImage = new Image("res/ball.png");
    private final Font font = new Font("res/conformable.otf", 24);

    private static final double STEP_SIZE = 2;
    private static final Point BALL_POINT = new Point(650, 180);
    private static final Point TEXT_POINT = new Point(32, 32);
    private static final double SCORE_DISTANCE = 20;

    private double playerX = 10;
    private double playerY = 350;

    private double playerDirectionX = 0;
    private double playerDirectionY = 0;

    // for rounding double number
    private static DecimalFormat df = new DecimalFormat("#.##");

    private void setPlayerDirectionTo(Point destination) {
        double length = new Point(playerX, playerY).distanceTo(destination);
        playerDirectionX = (destination.x - playerX) / length;
        playerDirectionY = (destination.y - playerY) / length;
    }

    @Override
    protected void update(Input input) {
        if (input.wasPressed(Keys.ESCAPE)) {
            Window.close();
        } else {
            if (input.wasPressed(Keys.ENTER)) {
                setPlayerDirectionTo(BALL_POINT);
                playerX += STEP_SIZE * playerDirectionX;
                playerY += STEP_SIZE * playerDirectionY;
                System.out.println(df.format(playerX) + ", " + df.format(playerY));
            }
            if (new Point (playerX, playerY).distanceTo(BALL_POINT) <= SCORE_DISTANCE) {
                font.drawString("Great job!", TEXT_POINT.x, TEXT_POINT.y);
            }
        }
        ballImage.draw(BALL_POINT.x, BALL_POINT.y);
        playerImage.draw(playerX, playerY);
    }

    public static void main(String[] args) {
        new AutoGame().run();
    }

}
