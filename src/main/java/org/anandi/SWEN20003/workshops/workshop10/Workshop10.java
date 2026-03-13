package org.anandi.SWEN20003.workshops.workshop10;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Workshop10 {

    public static List<List<String>> readCsv(String filename)
            throws IOException, CsvException {
        List<List<String>> result = new ArrayList<>();

        String contents = Files.readString(Path.of(filename),
                StandardCharsets.UTF_8);
        String[] allRows = contents.split("\n");
        String header = allRows[0];
        String[] rows = Arrays.copyOfRange(allRows, 1, allRows.length);

        int columnCount = header.split(",").length;

        for (int i = 0; i < rows.length; i++) {
            String row = rows[i];

            boolean inQuote = false;
            List<String> parsedRow = new ArrayList<>();
            String soFar = "";

            for (int j = 0; j < row.length(); j++) {
                char at = row.charAt(j);
                if (at == '"') {
                    inQuote = !inQuote;
                }
                if (at == ',') {
                    if (!inQuote) {
                        parsedRow.add(soFar);
                        soFar = "";
                    } else {
                        soFar += ",";
                    }
                } else {
                    soFar += at;
                }
            }
            parsedRow.add(soFar);

            if (inQuote) {
                throw new UnmatchedQuoteException(filename,i);
            }
            if (parsedRow.size() < columnCount) {
                throw new NotEnoughEntriesException(filename, i);
            }
            if (parsedRow.size() > columnCount) {
                throw new TooManyEntriesException(filename, i);
            }
            result.add(parsedRow);
        }
        return result;
    }

}
