package org.anandi.SWEN20003.workshops.workshop3;

import java.util.Scanner;

public class Acronym {

//    1. Scan the whole input
//    2. Split the input line into words (separated by spaces)
//    3. For each word, take only the first letter
//    4. Convert all first letters to upper case
    
    public static String acronym(String line) {
        // Assumes well-formed input
        String result = "";
        String[] wordArray = line.split(" ");

        // Add first char of each word to the result string
        for(String word : wordArray) {
            result += word.substring(0,1);
        }

        return result.toUpperCase();
    }

    public static void main(String[] args) {
        String line = new Scanner(System.in).nextLine();
        System.out.println(acronym(line));
    }

}
