package org.anandi.SWEN20003.workshops.workshop2;

public class Library {

    private static final int MAX_NUM_OF_BOOKS = 10;
    private Book[] books;
    private int numOfBooks = 0;

    public Library() {
        this.books = new Book[MAX_NUM_OF_BOOKS];
    }

    public void addBook(Book book) {
        if (numOfBooks < MAX_NUM_OF_BOOKS) {
            books[numOfBooks] = book;
            numOfBooks++;
        }
    }

    public Book lookup(String title) {
        for (int i = 0; i < numOfBooks; i++) {
            Book currentBook = books[i];
            if (currentBook.getTitle().equals(title)) {
                return currentBook;
            }
        }
        return null;
    }

    public Book lookup(String author, String title) {
        for (int i = 0; i < numOfBooks; i++) {
            Book currentBook = books[i];
            if (currentBook.getTitle().equals(title) && currentBook.getAuthor().equals(author)) {
                return currentBook;
            }
        }
        return null;
    }

    public String getCatalogue() {
        String catalogue = "";
        for (int i = 0; i < numOfBooks; i++) {
            catalogue += books[i].toString() + "\n";
        }
        return catalogue;
    }

    public int getNumOfBorrows() {
        int numOfBorrows = 0;
        for (int i = 0; i < numOfBooks; i++) {
            if (books[i].isBorrowed()) {
                numOfBorrows++;
            }
        }
        return numOfBorrows;
    }
}
