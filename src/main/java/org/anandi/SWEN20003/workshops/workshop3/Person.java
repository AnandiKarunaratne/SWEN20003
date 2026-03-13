package org.anandi.SWEN20003.workshops.workshop3;

public class Person {

    private String name;
    private Point location;
    private Household household;

    private static Person[] people = new Person[100];
    private static int peopleCount = 0;

    public Person(String name, Point location, Household household) {
        this.name = name;
        this.location = location;
        this.household = household;

        if (peopleCount < 100) {
            people[peopleCount++] = this;
        }
    }

    public Person(String name, Point location) {
        this.name = name;
        this.location = location;
    }

    public void setHousehold(Household household) {
        this.household = household;
    }

    public double distanceToPerson(Person person) {
        return this.location.distanceTo(person.location);
    }

    private Person[] peopleCloserThan(double distance) {
        int numCloser = 0;
        // Count how many people are close
        for (int i = 0; i < peopleCount; ++i) {
            if (distanceToPerson(people[i]) < distance) {
                ++numCloser;
            }
        }
        // Create an appropriately-sized array, and then fill it
        Person[] result = new Person[numCloser];
        int count = 0;
        for (int i = 0; i < peopleCount; ++i) {
            if (distanceToPerson(people[i]) < distance) {
                result[count++] = people[i];
            }
        }
        return result;
    }

    public int numCloseOutsideHousehold(double distance) {
        Person[] people = peopleCloserThan(distance);
        int count = 0;
        for (int i = 0; i < people.length; ++i) {
            // If they are not from this person's household, increment counter
            if (!household.contains(people[i])) {
                ++count;
            }
        }
        return count;
    }

    public boolean equals(Person person) {
        return this.name.equals(person.name) && this.household.equals(person.household);
    }

}
