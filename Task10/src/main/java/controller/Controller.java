package controller;

import service.ServiceBooks;
import util.InputUtility;
import util.ResourceManager;
import view.BookView;

public class Controller {
    static ResourceManager manager = ResourceManager.INSTANCE;
    static ServiceBooks serviceBooks = new ServiceBooks();
    static BookView view = new BookView();
    static InputUtility inputUtility = new InputUtility(view);

    public void run() {
        while (true) {
            view.printMessage(manager.getMessage("mainMenu"));
            int number = inputUtility.inputIntValue(manager.getMessage("INPUT_INT_DATA"), manager.getMessage("WRONG_INPUT_DATA"), 0, 6);
            ItemMenu command = defineMenuItem(number);
            command.exec();
        }
    }

    private ItemMenu defineMenuItem(int number) {
        return ItemMenu.values()[number];
    }
}
