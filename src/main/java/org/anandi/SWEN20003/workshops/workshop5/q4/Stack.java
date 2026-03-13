package org.anandi.SWEN20003.workshops.workshop5.q4;

public class Stack extends LinkedList {

    // We can consider root to be the top, or the last node to be the top.

    public void push(int value) {
        this.insert(0, value);
    }

    public Integer pop() {
        if (super.length() > 0) {
            int value = root().value;
            super.remove(0);
            return value;
        } else {
            return null;
        }
    }

}
