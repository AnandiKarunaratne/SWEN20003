package org.anandi.SWEN20003.workshops.workshop7;

import java.util.ArrayList;

public class Student extends Person {
    private int number;
    private ArrayList<Subject> subjects = new ArrayList<>();

    public Student(String name, int age) {
        super(name, age);
    }

    public void enrol(Subject subject) {
        subjects.add(subject);
        subject.enrol(this);
    }
}
