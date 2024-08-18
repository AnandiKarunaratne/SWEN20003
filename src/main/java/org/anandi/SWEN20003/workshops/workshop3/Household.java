package org.anandi.SWEN20003.workshops.workshop3;

public class Household {

    private String name;
    private Person[] people;
    private static final int MAX_PEOPLE = 5;
    private int numOfPeople = 0;

    public Household(String name, Person[] people) {
        this.name = name;
        if (people.length <= MAX_PEOPLE) {
            this.people = people;
        } else {
            this.people = new Person[MAX_PEOPLE];
            for (int i = 0; i < MAX_PEOPLE; i++) {
                this.people[i] = people[i];
            }
        }
    }

    public void addPerson(Person person) {
        if (numOfPeople < MAX_PEOPLE) {
            people[numOfPeople] = person;
            numOfPeople++;
        }
    }

    public boolean equals(Household household) {
        // since household names are unique
        return this.name.equals(household.name);
    }

    public boolean contains(Person person) {
        for (int i = 0; i < numOfPeople; ++i) {
            if (person.equals(people[i])) {
                return true;
            }
        }
        return false;
    }

    public int numCloseOutsideHousehold(double distance) {
        int count = 0;
        for (Person person : people) { // enhanced for-loop
            if (person.numCloseOutsideHousehold(distance) > 0) {
                ++count;
            }
        }
        return count;
    }

}
