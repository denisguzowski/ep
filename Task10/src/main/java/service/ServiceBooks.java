package service;

import model.Books;
import model.entity.Book;
import util.Language;
import util.ResourceManager;
import util.WWFiles;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

public class ServiceBooks {
    private Books model = new Books();
    private ResourceManager manager = ResourceManager.INSTANCE;

    public ServiceBooks() {
        model.setBooks(WWFiles.load());
    }

    public String showAllBooks() {
        return convertBooksInString(model.getBooks());
    }

    private String convertBooksInString(Book[] books) {
        StringBuilder str = new StringBuilder();
        for (Book book : books ) {
            str.append(book);
            str.append("\n");
        }
        return str.toString();
    }

    public void saveBooks(){
        WWFiles.save(model.getBooks());
    }

    public String searchBooksByAuthor(String author){
        Book[] books = model.getByAuthor(author);
        if (books.length == 0) {
            return manager.getMessage("NO_BOOKS") + author;
        }
        return manager.getMessage("BOOKS_AUTHOR") + author + "\n" + convertBooksInString(books);
    }

    public String searchBooksByPublisher(String publisher){
        Book[] books = model.getByPublisher(publisher);
        if (books.length == 0) {
            return manager.getMessage("NO_BOOKS") + publisher;
        }
        return manager.getMessage("BOOKS_PUBLISHER") + publisher + "\n" + convertBooksInString(books);
    }

    public String searchBooksAfterYear(int year){
        Book[] books = model.getAfterYear(year);
        if (books.length == 0) {
            return manager.getMessage("NO_BOOKS_AFTER") + year;
        }
        return manager.getMessage("BOOKS_AFTER") + year + "\n" + convertBooksInString(books);
    }

    public String sortByPublisher() {
        Book[] books = model.getBooks();
        Arrays.sort(books, Comparator.comparing(Book::getPublish));
        return convertBooksInString(books);
    }

    public void changeLanguage(int choice){
        Language[] languages = Language.values();
        Locale locale = languages[choice - 1].getLocale();
        manager.changeLocale(locale);
    }
}
