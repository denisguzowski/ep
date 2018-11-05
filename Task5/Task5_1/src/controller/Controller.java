package controller;

import controller.service.JournalService;
import controller.service.RegularExpressions;
import view.ConstantMessages;
import view.InputUtility;
import view.Menu;
import view.View;

public class Controller {
    private View view = new View();
    private InputUtility inputUtility = new InputUtility(view);
    private JournalService service = new JournalService();


    public void run(){
        while (true){
            view.printMessage(Menu.MENU);
            int valueItem = inputUtility.inputIntValue(ConstantMessages.MENU_ITEM, ConstantMessages.WRONG_INPUT_DATA, 0, 2);

            switch(valueItem){
                case 1:
                    branch1();
                    break;
                case 2:
                    displayJournal(service);
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }

    private void branch1(){
        service.setSurname(inputUtility.inputString(ConstantMessages.SURNAME, ConstantMessages.WRONG_INPUT_DATA, RegularExpressions.SURNAME));
        service.setName(inputUtility.inputString(ConstantMessages.NAME, ConstantMessages.WRONG_INPUT_DATA, RegularExpressions.NAME));
        service.setDateOfBirth(inputUtility.inputString(ConstantMessages.DATA_OF_BIRTH, ConstantMessages.WRONG_INPUT_DATA, RegularExpressions.DATE_OF_BIRTH));
        service.setPhoneNumber(inputUtility.inputString(ConstantMessages.PHONE_NUMBER, ConstantMessages.WRONG_INPUT_DATA, RegularExpressions.PHONE_NUMBER));
        service.setStreet(inputUtility.inputString(ConstantMessages.STREET, ConstantMessages.WRONG_INPUT_DATA, RegularExpressions.STREET));
        service.setHouse(inputUtility.inputString(ConstantMessages.HOUSE, ConstantMessages.WRONG_INPUT_DATA, RegularExpressions.HOUSE));
        service.setApartment(inputUtility.inputString(ConstantMessages.APARTMENT, ConstantMessages.WRONG_INPUT_DATA, RegularExpressions.APARTMENT));

        if(service.addRecord()){
            view.printMessage(ConstantMessages.RECORD_WAS_ADDED);
        }else{
            view.printMessage(ConstantMessages.RECORD_WAS_NOT_ADDED);
        }
    }

    private void displayJournal(JournalService js) {
        if (js.getNumberOfRecords() == 0) {
            view.printMessage(ConstantMessages.EMPTY_JOURNAL);
        } else {
            view.printMessage(js.getJournalAsString());
        }
    }
}
