package org.anandi.SWEN20003.workshops.workshop4;

import bagel.*;
import bagel.util.Point;

import java.text.DecimalFormat;

public class CatchBall extends AbstractGame {

    private final Image playerImage = new Image("res/player.png");
    private final Ball ball = new Ball();
    private final Font font = new Font("res/conformable.otf", 24);

    private static final double STEP_SIZE = 10;
    private static final double SCORE_DISTANCE = 20;
    private static final Point TEXT_POSITION = new Point(32, 32);

    private static DecimalFormat df = new DecimalFormat("0.00");

    private double playerX = 200;
    private double playerY = 350;
    private double playerDirectionX = 0;
    private double playerDirectionY = 0;
    private int score = 0;

    @Override
    protected void update(Input input) {
        if (input.wasPressed(Keys.ESCAPE)) {
            Window.close();
        } else {
            if (input.wasPressed(Keys.ENTER)) {
                setPlayerDirectionTo(ball.getPosition());
                playerX += STEP_SIZE * playerDirectionX;
                playerY += STEP_SIZE * playerDirectionY;
            }
            if (new Point(playerX, playerY).distanceTo(ball.getPosition()) <= SCORE_DISTANCE) {
                score++;
                ball.setRandomPosition();
            }
            font.drawString("Score: " + score, TEXT_POSITION.x, TEXT_POSITION.y);
            ball.update();
            playerImage.draw(playerX, playerY);
        }
    }

    private void setPlayerDirectionTo(Point destination){
        double length = new Point(playerX, playerY).distanceTo(destination);
        playerDirectionX = (destination.x - playerX)/length;
        playerDirectionY = (destination.y - playerY)/length;
    }

    public static void main(String[] args) {
        new CatchBall().run();
    }
}
