package controller.commands;

import service.ServiceBooks;

public class Exit extends Command{
    private ServiceBooks serviceBooks;

    public Exit(ServiceBooks serviceBooks) {
        this.serviceBooks = serviceBooks;
    }

    @Override
    public void execute() {
        serviceBooks.saveBooks();
        System.exit(0);
    }
}
