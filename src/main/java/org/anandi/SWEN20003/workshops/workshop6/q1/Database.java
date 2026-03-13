package org.anandi.SWEN20003.workshops.workshop6.q1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Database {

    private final FileWriteable[] data = new FileWriteable[100];

    public void add(FileWriteable row) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = row;
                break;
            }
        }
    }

    public void remove(FileWriteable row) {
        for (int i = 0; i < data.length; i++) {
            if (row.equals(data[i])) {
                data[i] = null;
                break;
            }
        }
    }

    public void writeAll(String filename) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename))) {
            for (FileWriteable row : data) {
                if (row != null) {
                    row.writeToFile(bufferedWriter);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
