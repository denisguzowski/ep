package controller.commands;

import service.ServiceBooks;
import util.ResourceManager;
import view.BookView;

public class SortByPublisher extends Command{
    private ResourceManager manager;
    private ServiceBooks serviceBooks;
    private BookView view;

    public SortByPublisher(ResourceManager manager, ServiceBooks serviceBooks, BookView view) {
        this.manager = manager;
        this.serviceBooks = serviceBooks;
        this.view = view;
    }

    @Override
    public void execute() {
        view.printMessage(manager.getMessage("SORTED_BOOKS"));
        view.printMessage(serviceBooks.sortByPublisher());
    }
}
