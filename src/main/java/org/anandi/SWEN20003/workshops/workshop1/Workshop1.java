package org.anandi.SWEN20003.workshops.workshop1;

public class Workshop1 {

    public static void main(String[] args) {
        question2();
    }

    public static void question1() {
        // the size of the triangle
        int size = 19;

        for (int i = 1; i <= size; i++) { // keeping track of how many #'s to print
            for (int j = 1; j <= i; j++) { // printing i number of #'s per row
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void question2() {
        // number of rows and columns
        // only works with odd values
        int n = 5;

        // first half
        for (int i = 1; i <= n; i += 2) { // i keeps track of the number of #'s to print

            /*
                how to calculate the number of spaces?
                each row prints "i" number of "#"s with the rest of the space equally
                distributed on sides.
                rest of the space = n - i
                half of the spaces at the beginning, and the rest at the end. (n - i)/2
            */
            int numOfSpaces = (n - i) / 2;

            // first half of the spaces
            for (int j = 1; j <= numOfSpaces; j++) {
                System.out.print(" ");
            }
            // #'s
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            // we don't have to print the second half of the spaces
            // after each row, print a line
            System.out.println();
        }

        // second half
        for (int i = n - 2; i >= 1; i -= 2) { // number of #'s to print
            int numOfSpaces = (n - i) / 2;

            // first half of the spaces
            for (int j = 1; j <= numOfSpaces; j++) {
                System.out.print(" ");
            }

            // #'s
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }

            System.out.println();
        }
    }





}


//    int number = 10;     // Box 1: Holds the value 10
//    int *ptr = &number;  // Box 2: Holds the address of Box 1 (points to number)

