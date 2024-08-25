package org.anandi.SWEN20003.workshops.workshop5.q1;

public class Pawn extends Piece {

    private boolean isFirstMove;

    public Pawn(int currentRow, int currentColumn) {
        super(currentRow, currentColumn);
        isFirstMove = false;
    }

    @Override
    public boolean isValidMove(int toRow, int toColumn) {
        System.out.println("Pawn class: isValidMove() method");
        if (super.isValidMove(toRow, toColumn)) {
            if (this.getCurrentColumn() == toColumn) {
                if (this.getCurrentRow() + 1 == toRow) {
                    return true;
                } else if (isFirstMove && (this.getCurrentRow() + 2 == toRow)) {
                    return true;
                }
            }
        }
        return false;
    }
}
