package org.anandi.SWEN20003.workshops.workshop6.q1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Point implements FileWriteable {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void writeToFile(BufferedWriter writer) throws IOException {
        String result = String.format("%f,%f", x, y);
        writer.write(result, 0, result.length());
        writer.newLine();
    }

}
