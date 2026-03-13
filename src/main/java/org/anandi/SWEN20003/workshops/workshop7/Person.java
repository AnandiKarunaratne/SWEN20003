package org.anandi.SWEN20003.workshops.workshop7;

public abstract class Person implements Comparable<Person> {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        int result = this.name.compareTo(other.name);
        if (result != 0) return result;
        return this.age - other.age;
    }
}
