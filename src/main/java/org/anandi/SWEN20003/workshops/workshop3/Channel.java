package org.anandi.SWEN20003.workshops.workshop3;

public class Channel {

    private final String name;
    private static final int MAX_SHOWS = 5;
    private Show[] shows;
    private int numOfShows = 0;

    public Channel(String name) {
        this.name = name;
        this.shows = new Show[MAX_SHOWS];
    }

    public void addShow(Show show) {
        if (numOfShows < MAX_SHOWS) {
            boolean isOverlapping = false;
            for (int i = 0; i < numOfShows; i++) {
                if (shows[i].isOverlapping(show)) {
                    isOverlapping = true;
                }
            }
            if (!isOverlapping) {
                shows[numOfShows++] = show;
            }
        }
    }

    public void cancelShow(Show show) {
        boolean hasShow = false;
        for (int i = 0; i < numOfShows; i++) {
            if (shows[i].equals(show)) {
                // shift the shows to the left of the array
                for (int j = i + 1; j < numOfShows; ++j) {
                    shows[j - 1] = shows[j];
                }
                shows[numOfShows] = null;
                numOfShows--;
            }
        }
    }

    public Show getShow(int hrs, int mins) {
        Show testShow = new Show("", 0, hrs, mins);
        for (int i = 0; i < numOfShows; i++) {
            Show show = shows[i];
            if (show.isOverlapping(testShow)) {
                return show;
            }
        }
        return null;
    }

    public boolean hasShow(Show show) {
        for (int i = 0; i < numOfShows; i++) {
            if (shows[i].equals(show)) {
                return true;
            }
        }
        return false;
    }

}
