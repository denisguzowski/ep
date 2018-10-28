package test_task2_1.test_model.test_comparators;

import org.junit.Test;
import task2_1.model.comparators.BookPublishingHouseComparator;
import task2_1.model.entity.Book;

import static junit.framework.TestCase.assertTrue;

public class TestBookPublishingHouseComparator {
    private BookPublishingHouseComparator comp = new BookPublishingHouseComparator();

    @Test
    public void testEqual(){
        Book book1 = new Book("", "", "a", 0, 0, 0);
        Book book2 = new Book("", "", "a", 0, 0, 0);

        int result = comp.compare(book1, book2);
        assertTrue("expected to be equal", result == 0);
    }

    @Test
    public void testGreaterThan(){
        Book book1 = new Book("", "", "b", 0, 0, 0);
        Book book2 = new Book("", "", "a", 0, 0, 0);

        int result = comp.compare(book1, book2);
        assertTrue("expected to be greater than", result > 0);
    }

    @Test
    public void testLessThan(){
        Book book1 = new Book("", "", "a", 0, 0, 0);
        Book book2 = new Book("", "", "b", 0, 0, 0);

        int result = comp.compare(book1, book2);
        assertTrue("expected to be less than", result < 0);
    }
}
