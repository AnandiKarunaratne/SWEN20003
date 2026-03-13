package org.anandi.SWEN20003.workshops.workshop5.q3;

public abstract class Request {

    public final String address;
    public final String file;

    public Request(String address, String file) {
        this.address = address;
        this.file = file;
    }

    public String getAddress() {
        return address;
    }

    public abstract short getPort();
    public abstract String getFullRequest();

}
