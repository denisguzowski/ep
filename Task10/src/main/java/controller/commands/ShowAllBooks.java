package controller.commands;

import service.ServiceBooks;
import util.ResourceManager;
import view.BookView;

public class ShowAllBooks extends Command{
    private ResourceManager manager;
    private ServiceBooks serviceBooks;
    private BookView view;

    public ShowAllBooks(ResourceManager manager, ServiceBooks serviceBooks, BookView view) {
        this.manager = manager;
        this.serviceBooks = serviceBooks;
        this.view = view;
    }

    @Override
    public void execute() {
        view.printMessage(manager.getMessage("ALL_BOOKS"));
        view.printMessage(this.serviceBooks.showAllBooks());
    }
}
