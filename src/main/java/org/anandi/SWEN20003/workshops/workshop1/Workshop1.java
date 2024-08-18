package org.anandi.SWEN20003.workshops.workshop1;

public class Workshop1 {

    public void question1() {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public void question2() {
        int size = 5; // number of rows and columns

        // first half
        for (int i = 1; i <= size; i += 2) {
            // how to calculate the number of spaces?
            // each row prints "i" number of "#"s with the rest of the space equally distributed on sides
            // rest of the space = n - i
            // half of the space at the beginning, and the rest at the end. (n - i)/2
            int numOfSpaces = (size - i) / 2;

            // first half of the spaces
            for (int j = 1; j <= numOfSpaces; j++) {
                System.out.print(" ");
            }
            // #'s
            for (int k = 1; k <= i; k++) {
                System.out.print("#");
            }
            // we don't have print the second half of the spaces
            // after each row, print a line
            System.out.println();
        }

        // second half
        for (int i = size - 2; i >= 1; i -= 2) {
            int numOfSpaces = (size - i) / 2;

            for (int j = 1; j <= numOfSpaces; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}


//    int number = 10;     // Box 1: Holds the value 10
//    int *ptr = &number;  // Box 2: Holds the address of Box 1 (points to number)

