package org.anandi.SWEN20003.workshops.workshop2;

import java.util.Objects;

public class Book {

    private String author, title;
    private boolean isBorrowed = false;
    private String borrowedBy = null;
    private static int numOfBorrows = 0;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    @Override
    public String toString() {
        return author + ": " + title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isBorrowed == book.isBorrowed && Objects.equals(author, book.author) && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title, isBorrowed);
    }

    public void borrow(String borrowedBy) {
        if(!isBorrowed) {
            isBorrowed = true;
            this.borrowedBy = borrowedBy;
            numOfBorrows++;
        }
    }

    public void returnBook() {
        if(isBorrowed) {
            isBorrowed = false;
            borrowedBy = null;
            numOfBorrows--;
        }
    }

    public static int getNumOfBorrows() {
        return numOfBorrows;
    }

}
