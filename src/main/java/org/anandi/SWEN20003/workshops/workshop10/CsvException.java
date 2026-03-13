package org.anandi.SWEN20003.workshops.workshop10;

public class CsvException extends Exception {
    public CsvException(String filename, String reason) {
        super("Error processing file " + filename + ": " + reason);
    }
}
