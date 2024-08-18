package org.anandi.SWEN20003;

import org.anandi.SWEN20003.workshops.workshop3.Household;
import org.anandi.SWEN20003.workshops.workshop3.Person;
import org.anandi.SWEN20003.workshops.workshop3.Point;

import java.util.Random;

public class Main {

    private final static Random rand = new Random();
    public static void main(String[] args) {
        Person aliceYan = new Person("Alice", randomPoint());
        Person bobYan = new Person("Bob", randomPoint());
        Person carterYan = new Person("Carter", randomPoint());
        Person dariusYan = new Person("Darius", randomPoint());
        Person eyreYan = new Person("Eyre", randomPoint());
        Person[] yans = new Person[] {
                aliceYan, bobYan, carterYan, dariusYan, eyreYan
        };
        Household yanHousehold = new Household("Yan", yans);
        for (Person person: yans) {
            person.setHousehold(yanHousehold);
        }
        Person aliceMcMurtry = new Person("Alice", randomPoint());
        Person bobMcMurtry = new Person("Bob", randomPoint());
        Person carterMcMurtry = new Person("Carter", randomPoint());
        Person dariusMcMurtry = new Person("Darius", randomPoint());
        Person eyreMcMurtry = new Person("Eyre", randomPoint());
        Person[] mcMurtrys = new Person[] {
                aliceMcMurtry, bobMcMurtry, carterMcMurtry, dariusMcMurtry, eyreMcMurtry
        };
        Household mcMurtryHousehold = new Household("McMurtry", mcMurtrys);
        for (Person person: mcMurtrys) {
            person.setHousehold(mcMurtryHousehold);
        }
        System.out.println("Number violating: " + yanHousehold.numCloseOutsideHousehold(10));
    }
    private static Point randomPoint(){
        return new Point(rand.nextInt(20), rand.nextInt(20));
    }

}