package org.anandi.SWEN20003.workshops.workshop6.q1;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        db.add(new Student("Alice", 766050));
        db.add(new Point(4.2, 6.9));
        db.add(new Car("Corolla", "white"));
        db.writeAll("sample.txt");
    }
}
