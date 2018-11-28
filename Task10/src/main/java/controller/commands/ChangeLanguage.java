package controller.commands;

import service.ServiceBooks;
import util.InputUtility;
import util.ResourceManager;
import view.BookView;

public class ChangeLanguage extends Command{
    private ResourceManager manager;
    private ServiceBooks serviceBooks;
    private BookView view;
    private InputUtility inputUtility;

    public ChangeLanguage(ResourceManager manager, ServiceBooks serviceBooks, BookView view, InputUtility inputUtility) {
        this.manager = manager;
        this.serviceBooks = serviceBooks;
        this.view = view;
        this.inputUtility = inputUtility;
    }

    @Override
    public void execute() {
        view.printMessage(manager.getMessage("LANGUAGE"));
        serviceBooks.changeLanguage(inputUtility.inputIntValue(manager.getMessage("INPUT_INT_DATA"), manager.getMessage("WRONG_INPUT_DATA"), 1, 3));
    }
}
