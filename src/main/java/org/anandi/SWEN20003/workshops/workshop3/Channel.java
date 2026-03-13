package org.anandi.SWEN20003.workshops.workshop3;

public class Channel {

    private static final int MAX_SHOWS = 5;

    private final String name;
    private int numShows = 0;
    private final Show[] shows = new Show[MAX_SHOWS];

    public Channel(String name) {
        this.name = name;
    }

    public void addShow(Show show) {
        if (numShows < MAX_SHOWS) {
            for (int i = 0; i < numShows; i++) {
                if (show.overlaps(shows[i])) {
                    return;
                }
            }
            shows[numShows++] = show;
        }
    }

    public Show getShow(int hrs, int mins) {
        Show testShow = new Show("", 0, hrs, mins);

        for (int i = 0; i < numShows; i++) {
            if (shows[i].overlaps(testShow)) {
                return shows[i];
            }
        }
        return null;
    }
}
