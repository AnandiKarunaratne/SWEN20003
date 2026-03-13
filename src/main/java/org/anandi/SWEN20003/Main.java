package org.anandi.SWEN20003;

import org.anandi.SWEN20003.workshops.workshop1.Workshop1;
import org.anandi.SWEN20003.workshops.workshop3.Household;
import org.anandi.SWEN20003.workshops.workshop3.Person;
import org.anandi.SWEN20003.workshops.workshop3.Point;
import org.anandi.SWEN20003.workshops.workshop8.Pair;

import java.awt.*;
import java.io.*;
import java.sql.Array;
import java.sql.SQLException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        try {
            exampleForCheckedException();
        } catch (FileNotFoundException e) {
            System.out.println("ERRORRRRRRR!!!!");
        }
    }

    public static void exampleForCheckedException() throws FileNotFoundException {
        FileReader file = new FileReader("someFile.txt");
    }

    public double exampleForUncheckedException(int num1, int num2) {
        return (double) num1/num2;
    }

}