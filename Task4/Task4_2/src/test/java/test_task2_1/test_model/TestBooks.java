package test_task2_1.test_model;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import task2_1.model.Books;
import task2_1.model.entity.Book;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class TestBooks {
    private static Books books;

    private static Book[] booksForTest = {
            new Book("Post office", "Charles Bukowski", "pub7", 1971, 190, 500),
            new Book("Factotum", "Charles Bukowski", "pub2", 1975, 210, 400),
            new Book("Pro JavaFX 9", "Johan Voc", "pub3", 2010, 600, 600),
            new Book("Pro Git", "Scott Chacon", "pub4", 2010, 640, 580),
            new Book("C Programming", "K. N. King", "pub3", 2006, 800, 640),
            new Book("Bash", "Arnold Robbins", "pub5", 2007, 300, 100),
            new Book("Network flow analysis", "Michael Lucas", "pub6", 2011, 530, 530),
            new Book("Bobby Fischer Teaches Chess", "Bobby Fischer", "pub1", 1965, 400, 1000),
    };


    @Parameterized.Parameter
    public String author;

    @Parameterized.Parameter(1)
    public String publishingHouse;

    @Parameterized.Parameter(2)
    public int year;

    @Parameterized.Parameter(3)
    public int lengthByAuthor; //array length

    @Parameterized.Parameter(4)
    public int lengthByPublishingHouse; //array length

    @Parameterized.Parameter(5)
    public int lengthAfterYear; //array length

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                //author, pubHouse, year, lengthByAuthor, lengthByPublishingHouse, lengthAfterYear
                {"a", "pub8", 2020, 0, 0, 0},
                {"Charles Bukowski", "pub7", 2006, 2, 1, 4},
                {"K. N. King", "pub3", 1971, 1, 2, 6}
        });
    }

    @BeforeClass
    public static void init(){
        books = new Books();
        books.setBooks(booksForTest);
    }

    @Test
    public void testGetBooksByAuthor(){
        assertEquals(books.getBooksByAuthor(author).length, lengthByAuthor);
    }

    @Test
    public void testGetBooksByPublishingHouse(){
        assertEquals(books.getBooksByPublishingHouse(publishingHouse).length, lengthByPublishingHouse);
    }

    @Test
    public void testGetBooksAfterGivenYear(){
        assertEquals(books.getBooksAfterGivenYear(year).length, lengthAfterYear);
    }

}
