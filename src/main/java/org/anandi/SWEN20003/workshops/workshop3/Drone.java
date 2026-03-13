package org.anandi.SWEN20003.workshops.workshop3;

public class Drone {

    private double homeX;
    private double homeY;
    private double x;
    private double y;
    private double altitude = 0.0;

    public Drone(double homeX, double homeY) {
        this.homeX = homeX;
        this.homeY = homeY;
        x = homeX;
        y = homeY;
    }

    public void flyUp(double amount) {
        altitude += amount;
    }

    public void flyDown(double amount) {
        altitude = Math.max(altitude - amount, 0);
    }

    public double distanceToHome() {
        return distance(x, y, homeX, homeY);
    }

    private static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 -y2));
    }

}
