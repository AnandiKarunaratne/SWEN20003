package org.anandi.SWEN20003.workshops.workshop6.q2;

public class ZooAnimal implements Comparable<ZooAnimal> {

    private final String name;
    private final String species;

    public ZooAnimal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    @Override
    public int compareTo(ZooAnimal other) {
        int result = name.compareTo(other.name);
        if (result != 0) return result;
        return species.compareTo(other.species);
    }

}
