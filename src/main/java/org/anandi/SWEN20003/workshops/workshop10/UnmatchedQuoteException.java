package org.anandi.SWEN20003.workshops.workshop10;

public class UnmatchedQuoteException extends CsvException {
    public UnmatchedQuoteException(String filename, int row) {
        super(filename, "unmatched quote in row " + row);
    }
}
