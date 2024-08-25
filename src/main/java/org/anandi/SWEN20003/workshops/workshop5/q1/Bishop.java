package org.anandi.SWEN20003.workshops.workshop5.q1;

public class Bishop extends Piece {

    public Bishop(int currentRow, int currentColumn) {
        super(currentRow, currentColumn);
    }

    @Override
    public boolean isValidMove(int toRow, int toColumn) {
        System.out.println("Rook class: isValidMove() method");
        if (!super.isValidMove(toRow, toColumn)) {
            return false;
        }
        int horizontalDiff = Math.abs(toRow - getCurrentRow());
        int verticalDiff = Math.abs(toColumn - getCurrentColumn());

        return horizontalDiff == verticalDiff;
    }
}
