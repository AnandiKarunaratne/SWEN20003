package org.anandi.SWEN20003.workshops.workshop8;

import java.util.Collection;
import java.util.Collections;

public class SortedCycleList<T extends Comparable<T>> extends CycleList<T> {
    @Override
    public void add (T value) {
        items.add(value);
        Collections.sort(items);
    }

    @Override
    public void addAll(Collection<T> collection) {
        items.addAll(collection);
        Collections.sort(items);
    }


}
