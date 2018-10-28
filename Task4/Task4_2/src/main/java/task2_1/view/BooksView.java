package task2_1.view;

import task2_1.model.entity.Book;

public class BooksView {
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please ";

    public static final String MENU  = "Menu: \n"
            + "Enter 0 to Get a full list of books; \n"
            + "Enter 1 to Get a list of books by the specified author; \n"
            + "Enter 2 to Get a list of books that are published by "
            + "specified publishing house; \n"
            + "Enter 3 to Get a list of books published later specified year; \n"
            + "Enter 4 to Sort books by publishers; \n"
            + "Enter 5 to Finish the program; ";

    public static final String AUTHORS_NAME = "Enter an author's name";
    public static final String PUBLISHING_HOUSE_NAME = "Enter a publishing house name";
    public static final String YEAR = "Enter a year";

    //public static final String BACK_TO_MENU = "Enter 5 to go back to menu";
    //public static final String FINISH = "Enter 5 to Finish the program";

    public static final String RESULT = "Result: ";
    public static final String ALL_BOOKS = "All books: ";
    public static final String GOODBYE = "Goodbye ";
    public static final String NOTHING_FOUND = "Nothing found ";


    public void printMessage(String message){
        System.out.println(message);
    }

    public void printBooks(Book[] books){
        for (Book b:books) {
            System.out.println(b);
        }
        System.out.println();
    }

}
