package org.anandi.SWEN20003.workshops.workshop2;

import java.util.Objects;

public class Book {

    public String author;
    private String title;
    private boolean isBorrowed = false;
    private String borrowedBy = null;

    private static int numBorrows = 0;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public String toString() {
        return author + ": " + title;
    }

    public boolean equals(Book otherBook) {
        return this.author.equals(otherBook.getAuthor()) &&
                this.title.equals(otherBook.getTitle());
    }

    public void borrow(String borrowedBy) {
        if (!isBorrowed) {
            this.isBorrowed = true;
            this.borrowedBy = borrowedBy;
            numBorrows++;
        }
    }

    public void returnBook() {
        if (isBorrowed) {
            this.isBorrowed = false;
            this.borrowedBy = null;
            numBorrows--;
        }
    }

    public static int getNumBorrows() {
        return numBorrows;
    }

}
