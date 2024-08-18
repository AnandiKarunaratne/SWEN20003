package org.anandi.SWEN20003.workshops.workshop3;

public class Network {

    private static final int MAX_CHANNELS = 3;
    private Channel[] channels;
    private final String name;
    private int numOfChannels = 0;

    public Network(String name) {
        this.name = name;
        this.channels = new Channel[MAX_CHANNELS];
    }

    public void addChannel(Channel channel) {
        if (numOfChannels < MAX_CHANNELS) {
            channels[numOfChannels++] = channel;
        }
    }

    public void removeChannel(Channel channel) {
        for (int i = 0; i < numOfChannels; i++) {
            if (channels[i].equals(channel)) {
                // shift the channels to the left of the array
                for (int j = i + 1; j < numOfChannels; j++) {
                    channels[j - 1] = channels[j];
                }
                channels[numOfChannels] = null;
                numOfChannels--;
            }
        }
    }

    public Show[] getShows(int hrs, int mins) {
        Show[] result = new Show[numOfChannels];
        int numOfCurrentShows = 0;

        for (int i = 0; i < numOfChannels; i++) {
            Channel channel = channels[i];
            Show currentShow = channel.getShow(hrs, mins);
            if (currentShow != null) {
                result[numOfCurrentShows++] = currentShow;
            }
        }
        return result;
    }

    public Channel lookupShow(Show show) {
        for (int i = 0; i < numOfChannels; i++) {
            if (channels[i].hasShow(show)) {
                return channels[i];
            }
        }
        return null;
    }
}

// hasShow method in the Channel class
//public boolean hasShow(Show show) {
//    for (int i = 0; i < numOfShows; i++) {
//        if (shows[i].equals(show)) {
//            return true;
//        }
//    }
//    return false;
//}
