package task2_1.controller;

import task2_1.data.DataSource;
import task2_1.model.Books;
import task2_1.model.entity.Book;
import task2_1.utilities.InputUtility;
import task2_1.view.BooksView;

public class Controller {
    private Books model = new Books();
    private BooksView view = new BooksView();


    public void run(){
        model.setBooks(DataSource.getBooks());

        cycle:
            while (true){
                view.printMessage(BooksView.MENU);
                int inputInt = InputUtility.inputIntValueWithScanner(0, 5);

                switch (inputInt){
                    case 0: view.printMessage(BooksView.ALL_BOOKS);
                            view.printBooks(model.getBooks());
                            break;
                    case 1: view.printMessage(BooksView.AUTHORS_NAME);
                            searchBooksByAuthor(InputUtility.inputStringWithScanner());
                            break;
                    case 2: view.printMessage(BooksView.PUBLISHING_HOUSE_NAME);
                            searchBooksByPublishingHouse(InputUtility.inputStringWithScanner());
                            break;
                    case 3: view.printMessage(BooksView.YEAR);
                            searchBooksAfterGivenYear(InputUtility.inputIntValueWithScanner(1, Integer.MAX_VALUE));
                            break;
                    case 4: view.printBooks(model.getBooksSortedByPublishingHouse());
                            break;
                    case 5: view.printMessage(BooksView.GOODBYE);
                            break cycle;
                    //default:break;
                }

            }
    }

    private void searchBooksByAuthor(String author) {
        Book[] result = model.getBooksByAuthor(author);
        if (result.length == 0) {
            view.printMessage(BooksView.NOTHING_FOUND);
        } else {
            view.printMessage(BooksView.RESULT);
            view.printBooks(result);
        }
    }

    private void searchBooksByPublishingHouse(String publishingHouse) {
        Book[] result = model.getBooksByPublishingHouse(publishingHouse);
        if (result.length == 0) {
            view.printMessage(BooksView.NOTHING_FOUND);
        } else {
            view.printMessage(BooksView.RESULT);
            view.printBooks(result);
        }
    }

    private void searchBooksAfterGivenYear(int year) {
        Book[] result = model.getBooksAfterGivenYear(year);
        if (result.length == 0) {
            view.printMessage(BooksView.NOTHING_FOUND);
        } else {
            view.printMessage(BooksView.RESULT);
            view.printBooks(result);
        }
    }


}
