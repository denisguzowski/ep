package test_task2_1.test_model;

import org.junit.Test;
import task2_1.model.Books;
import task2_1.model.entity.Book;

import static org.junit.Assert.assertTrue;

public class TestBooksS {
    private Book[] booksForTest = {
            new Book("Post office", "Charles Bukowski", "pub7", 1971, 190, 500),
            new Book("Factotum", "Charles Bukowski", "pub2", 1975, 210, 400),
            new Book("Pro JavaFX 9", "Johan Voc", "pub3", 2010, 600, 600),
            new Book("Pro Git", "Scott Chacon", "pub4", 2010, 640, 580),
            new Book("C Programming", "K. N. King", "pub3", 2006, 800, 640),
            new Book("Bash", "Arnold Robbins", "pub5", 2007, 300, 100),
            new Book("Network flow analysis", "Michael Lucas", "pub6", 2011, 530, 530),
            new Book("Bobby Fischer Teaches Chess", "Bobby Fischer", "pub1", 1965, 400, 1000),
    };

    @Test
    public void testSortBooksByPublishingHouse(){
        Books books = new Books();
        books.setBooks(booksForTest);

        books.sortBooksByPublishingHouse();
        Book prev = books.getBooks()[0];
        for (int i = 1; i < books.getBooks().length; i++) {
            Book current = books.getBooks()[i];
            assertTrue(current.getPublishingHouse().compareTo(prev.getPublishingHouse()) >= 0);
            prev = current;
        }
    }
}
