package org.anandi.SWEN20003.workshops.workshop2;

public class Library {

    private static final int MAX_BOOKS = 10;
    private int numBooks = 0;
    private Book[] books = new Book[MAX_BOOKS];
    private int numBorrows = 0;

    public void addBook(Book book) {
        if (numBooks < MAX_BOOKS) {
            books[numBooks] = book;
            numBooks++;
        }
    }

    public Book lookup(String title) {
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                return books[i];
            }
        }
        return null;
    }

    public Book lookup(String title, String author) {
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getTitle().equals(title) &&
                    books[i].getAuthor().equals(author)) {
                return books[i];
            }
        }
        return null;
    }

    public String getCatalogue() {
        String result = "";
        for (int i = 0; i < numBooks; i++) {
            result += books[i].toString() + "\n";
        }
        return result;
    }

    public int getNumBorrowed() {
        int count = 0;
        for (int i = 0; i < numBooks; i++) {
            if (books[i].isBorrowed()) {
                count++;
            }
        }
        numBorrows = count;
        return numBorrows;
    }

}
