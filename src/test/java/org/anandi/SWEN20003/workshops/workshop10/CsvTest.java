package org.anandi.SWEN20003.workshops.workshop10;

import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;

public class CsvTest {

    @Test
    public void testValid() {
        List<List<String>> result = new ArrayList<>();
        List<String> row1 = new ArrayList<>();
        row1.add("Alice");
        row1.add("90");
        List<String> row2 = new ArrayList<>();
        row2.add("Bob");
        row2.add("65");
        List<String> row3 = new ArrayList<>();
        row3.add("Carol");
        row3.add("72");
        result.add(row1);
        result.add(row2);
        result.add(row3);

        try {
            assertEquals(result, Workshop10.readCsv("/Users/anandik/Library/CloudStorage/OneDrive-TheUniversityofMelbourne/SWEN20003/Code/SWEN20003/src/test/res/csvFile.csv"));
        } catch (IOException | CsvException e) {
            e.printStackTrace();
            fail();
        }
    }

    @Test(expected = NotEnoughEntriesException.class)
    public void testNotEnoughEntries() throws IOException, CsvException {
        Workshop10.readCsv("/Users/anandik/Library/CloudStorage/OneDrive-TheUniversityofMelbourne/SWEN20003/Code/SWEN20003/src/test/res/invalidCsvFile.csv");
    }

}
