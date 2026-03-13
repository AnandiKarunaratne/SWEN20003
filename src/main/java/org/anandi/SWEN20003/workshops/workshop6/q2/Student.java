package org.anandi.SWEN20003.workshops.workshop6.q2;

import java.util.Arrays;

public class Student implements Comparable<Student> {

    private final String name;
    private final int number;

    public Student(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public int compareTo(Student other) {
        if (name.compareTo(other.name) < 0) {
            return -1;
        }
        if (name.compareTo(other.name) > 0) {
            return 1;
        }
        return number - other.number;
    }

    public String toString() {
        return String.format("(%s, %d)", name, number);
    }

    public static void main(String[] args) {
        Student[] students = new Student[] {
                new Student("Alice", 753285),
                new Student("Charlie", 913571),
                new Student("Bob", 832572),
                new Student("Bob", 632564)
        };
        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }

}
