package org.anandi.SWEN20003.workshops.workshop10;

public class TooManyEntriesException extends CsvException {
    public TooManyEntriesException(String filename, int row) {
        super(filename, "too many entries in row " + row);
    }
}
