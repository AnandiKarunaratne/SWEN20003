package org.anandi.SWEN20003.workshops.workshop11.q2;

public enum Direction {

    NORTH(0) {
        @Override
        public int toDegrees() {
            return 0;
        }
    },
    SOUTH(180),
    EAST(90),
    WEST(270);
    private int degrees;
    private Direction(int degrees) {
        this.degrees = degrees;
    }

    public int toDegrees() {
        return degrees;
    }
}

/*
public class Direction() {
    public Direction(int degrees) {

    }
}
 */
