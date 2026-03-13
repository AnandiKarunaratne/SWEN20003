package org.anandi.SWEN20003.workshops.workshop5.q1;

public class Pawn extends Piece {

    private boolean hasMoved = false;

    public Pawn(int currentRow, int currentColumn) {
        super(currentRow, currentColumn);
    }

    @Override
    public boolean isValidMove(int toRow, int toColumn) {
        int row = super.getCurrentRow();
        int col = super.getCurrentColumn();

        if (row == toRow) {
            if (!hasMoved && Math.abs(col - toColumn) == 2) {
                hasMoved = true;
                return true;
            } else if (hasMoved && Math.abs(col - toColumn) == 1) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
