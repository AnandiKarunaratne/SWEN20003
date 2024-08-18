package org.anandi.SWEN20003.workshops.workshop3;

public class Show {

    private final String name;
    private final int duration;
    private final int airTimeHrs;
    private final int airTimeMins;

    public Show(String name, int duration, int airTimeHrs, int airTimeMins) {
        this.name = name;
        this.duration = duration;
        this.airTimeHrs = airTimeHrs;
        this.airTimeMins = airTimeMins;
    }

    // getters
    public String getName() {
        return name;
    }

    // start time in minutes
    public int getStartTime() {
        return this.airTimeHrs * 60 + this.airTimeMins;
    }

    // end time in minutes
    public int getEndTime() {
        return getStartTime() + this.duration;
    }

    public boolean isOverlapping(Show other) {
        // Check if this starts while other is on
        boolean check1 = this.getStartTime() >= other.getStartTime() && this.getStartTime() < other.getEndTime();
        // Check if other starts while this is on
        boolean check2 = this.getStartTime() <= other.getStartTime() && this.getEndTime() > other.getStartTime();
        return check1 || check2;
    }
}
