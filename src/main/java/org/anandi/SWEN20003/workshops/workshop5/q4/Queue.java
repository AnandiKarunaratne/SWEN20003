package org.anandi.SWEN20003.workshops.workshop5.q4;

public class Queue extends LinkedList {

    public void enqueue(int value) {
        super.append(value);
    }

    public Integer take() {
        if (super.length() > 0) {
            int value = super.root().value;
            super.remove(0);
            return value;
        } else {
            return null;
        }
    }

}
