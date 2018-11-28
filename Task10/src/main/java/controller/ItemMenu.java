package controller;

import controller.commands.*;

//Command Manager
public enum ItemMenu {
    EXIT(new Exit(Controller.serviceBooks)),
    SHOW_BOOKS(new ShowAllBooks(Controller.manager, Controller.serviceBooks, Controller.view)),
    FIND_AUTHOR(new SearchBooksByAuthor(Controller.manager, Controller.serviceBooks, Controller.view, Controller.inputUtility)),
    FIND_PUBLISH(new SearchBooksByPublisher(Controller.manager, Controller.serviceBooks, Controller.view, Controller.inputUtility)),
    FIND_YEAR(new SearchBooksAfterYear(Controller.manager, Controller.serviceBooks, Controller.view, Controller.inputUtility)),
    SORT_PUBLISH(new SortByPublisher(Controller.manager, Controller.serviceBooks, Controller.view)),
    LANG(new ChangeLanguage(Controller.manager, Controller.serviceBooks, Controller.view, Controller.inputUtility));

    private Command command;

    ItemMenu(Command command) {
        this.command = command;
    }

    public void exec(){
        this.command.execute();
    }
}
