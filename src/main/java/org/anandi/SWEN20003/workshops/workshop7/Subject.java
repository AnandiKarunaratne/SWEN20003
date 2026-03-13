package org.anandi.SWEN20003.workshops.workshop7;

import java.util.ArrayList;

public class Subject {
    private String name;
    private ArrayList<Student> students = new ArrayList<>();

    public void enrol(Student student) {
        students.add(student);
    }
}
