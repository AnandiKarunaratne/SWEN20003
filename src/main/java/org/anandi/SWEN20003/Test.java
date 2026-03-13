package org.anandi.SWEN20003;

public class Test {

    static class Piece {
        void isValid() {
            System.out.println("Piece's isValid method");
        }

        void move() {
            System.out.println("Piece's move method");
            isValid();
        }
    }

    static class Rook extends Piece {
        @Override
        void isValid() {
            System.out.println("Rook's isValid method");
        }
    }

    public static void main(String[] args) {
        Rook rook1 = new Rook();
        rook1.move();

        Piece rook2 = new Rook();
        rook2.move();

        Piece rook3 = new Piece();
        rook3.move();
    }

}
