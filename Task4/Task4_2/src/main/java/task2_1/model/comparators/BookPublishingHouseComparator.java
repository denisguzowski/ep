package task2_1.model.comparators;

import task2_1.model.entity.Book;

import java.util.Comparator;

public class BookPublishingHouseComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getPublishingHouse().compareTo(o2.getPublishingHouse());
    }
}
