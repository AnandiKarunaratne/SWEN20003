package org.anandi.SWEN20003.workshops.workshop3;

public class Show {

    private final String name;
    private final int duration;
    private final int airHours;
    private final int airMinutes;

    public Show(String name, int duration, int airHours, int airMinutes) {
        this.name = name;
        this.duration = duration;
        this.airHours = airHours;
        this.airMinutes = airMinutes;
    }

    public String getName() {
        return this.name;
    }

    public int getStartTime() {
        return airHours * 60 + airMinutes; // dealing with minutes only
    }

    public int getEndTime() {
        return getStartTime() + duration;
    }

    public boolean overlaps(Show other) {
        return (getStartTime() >= other.getStartTime() && getStartTime() < other.getEndTime()) ||
                (getStartTime() <= other.getStartTime() && getEndTime() > other.getStartTime());
    }
}
