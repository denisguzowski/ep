package test_task2_1.test_model.test_comparators;

import org.junit.Test;
import task2_1.model.comparators.BookYearComparator;
import task2_1.model.entity.Book;

import static junit.framework.TestCase.assertTrue;

public class TestBookYearComparator {
    private BookYearComparator comp = new BookYearComparator();

    @Test
    public void testEqual(){
        Book book1 = new Book("", "", "", 0, 0, 0);
        Book book2 = new Book("", "", "", 0, 0, 0);

        int result = comp.compare(book1, book2);
        assertTrue("expected to be equal", result == 0);
    }

    @Test
    public void testGreaterThan(){
        Book book1 = new Book("", "", "", 1, 0, 0);
        Book book2 = new Book("", "", "", 0, 0, 0);

        int result = comp.compare(book1, book2);
        assertTrue("expected to be greater than", result > 0);
    }

    @Test
    public void testLessThan(){
        Book book1 = new Book("", "", "", 0, 0, 0);
        Book book2 = new Book("", "", "", 1, 0, 0);

        int result = comp.compare(book1, book2);
        assertTrue("expected to be less than", result < 0);
    }
}
