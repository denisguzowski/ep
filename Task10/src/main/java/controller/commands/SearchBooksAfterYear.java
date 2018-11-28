package controller.commands;

import service.ServiceBooks;
import util.InputUtility;
import util.ResourceManager;
import view.BookView;

public class SearchBooksAfterYear extends Command{
    private ResourceManager manager;
    private ServiceBooks serviceBooks;
    private BookView view;
    private InputUtility inputUtility;

    public SearchBooksAfterYear(ResourceManager manager, ServiceBooks serviceBooks, BookView view, InputUtility inputUtility) {
        this.manager = manager;
        this.serviceBooks = serviceBooks;
        this.view = view;
        this.inputUtility = inputUtility;
    }

    @Override
    public void execute() {
        view.printMessage(serviceBooks.searchBooksAfterYear(inputUtility.inputIntValue(manager.getMessage("INPUT_INT_DATA"), manager.getMessage("WRONG_INPUT_DATA"), 1439, 2018)));
    }
}
