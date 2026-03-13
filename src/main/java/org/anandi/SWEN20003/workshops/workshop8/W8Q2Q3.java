package org.anandi.SWEN20003.workshops.workshop8;

import java.util.ArrayList;
import java.util.HashMap;

public class W8Q2Q3 {

    public String getSingleWords(ArrayList<String> strings) {
        String output = "";

        for (String string : strings) {
            if (string.split(" ").length == 1) {
                output += "," +string;
            }
        }
        return output;
    }




    public HashMap<Character, Integer> frequencyCount(String string) {
        HashMap<Character, Integer> result = new HashMap<>();

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            result.putIfAbsent(c, 0); // Make sure there is an entry for that key
            result.put(c, result.get(c) + 1); // Increase the existing value by 1
        }

        return result;
    }
}
