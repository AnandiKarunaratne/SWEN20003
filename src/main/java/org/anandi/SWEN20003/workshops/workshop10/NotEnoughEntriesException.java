package org.anandi.SWEN20003.workshops.workshop10;

public class NotEnoughEntriesException extends CsvException {
    public NotEnoughEntriesException(String filename, int row) {
        super(filename, "not enough entries in row " + row);
    }
}
