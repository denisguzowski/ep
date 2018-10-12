package task2_1.model;

import task2_1.model.comparators.BookPublishingHouseComparator;
import task2_1.model.comparators.BookYearComparator;
import task2_1.model.entity.Book;

import java.util.Arrays;

public class Books {
    private Book[] books;

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Book[] getBooksByAuthor(String author){
        Book[] result = new Book[books.length];
        int counter = 0;

        for (int i = 0; i < books.length; i++) {
            if(books[i].getAuthor().equals(author)){
                result[counter++] = books[i];
            }
        }
        return Arrays.copyOf(result, counter);
    }

    public Book[] getBooksByPublishingHouse(String publishingHouse){
        Book[] result = new Book[books.length];
        int counter = 0;

        for (int i = 0; i < books.length; i++) {
            if(books[i].getPublishingHouse().equals(publishingHouse)){
                result[counter++] = books[i];
            }
        }
        return Arrays.copyOf(result, counter);
    }

    public Book[] getBooksAfterGivenYear(int year){
        Book[] result = new Book[books.length];
        int counter = 0;

        Arrays.sort(books, new BookYearComparator());

        for (int i = 0; i < books.length; i++) {
            if(books[i].getYear() > year){
                result[counter++] = books[i];
            }
        }
        return Arrays.copyOf(result, counter);
    }

    public Book[] getBooksSortedByPublishingHouse(){
        Arrays.sort(books, new BookPublishingHouseComparator());
        return books;
    }
}
