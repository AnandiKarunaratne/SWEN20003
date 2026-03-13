package org.anandi.SWEN20003.workshops.workshop8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CycleList<T> {
    protected List<T> items = new ArrayList<>();
    protected int iterator = 0;

    public T next() {
        T item = items.get(iterator++);
        iterator %= items.size();
        return item;
    }

    public T alternativeNext() {
        T item = items.get(iterator);
        iterator++;
        if (iterator == items.size()) {
            iterator = 0;
        }
        return item;
    }

    public void add(T item) {
        items.add(item);
    }

    public boolean contains(T item) {
        return items.contains(item);
    }

    public void addAll(Collection<T> collection) {
        items.addAll(collection);
    }

    public void remove(T item) {
        items.remove(item);
    }
}
