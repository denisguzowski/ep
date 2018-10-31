package controller;

import model.ListSetGenerator;
import view.ConstantMessages;
import view.InputUtility;
import view.View;

public class Controller {
    private View view = new View();
    private InputUtility inputUtility = new InputUtility(view);
    private ListSetGenerator model = new ListSetGenerator();

    public void run(){
        view.printMessage(ConstantMessages.QUANTITY);
        int quantity = inputUtility.inputIntValue(0, Integer.MAX_VALUE);

        view.printMessage(ConstantMessages.MIN_ELEM);
        int min = inputUtility.inputIntValue(0, Integer.MAX_VALUE);

        view.printMessage(ConstantMessages.MAX_ELEM);
        int max = inputUtility.inputIntValue(min, Integer.MAX_VALUE);

        view.printMessage(ConstantMessages.RESULT);

        view.printMessage(ConstantMessages.ARRAY_LIST);
        view.printCollection(model.getIntegerArrayList(quantity, min, max));

        view.printMessage(ConstantMessages.LINKED_LIST);
        view.printCollection(model.getIntegerLinkedList(quantity, min, max));

        view.printMessage(ConstantMessages.HASH_SET);
        view.printCollection(model.getIntegerHashSet(quantity, min, max));

        view.printMessage(ConstantMessages.LINKED_HASH_SET);
        view.printCollection(model.getIntegerLinkedHashSet(quantity, min, max));

        view.printMessage(ConstantMessages.TREE_SET);
        view.printCollection(model.getIntegerTreeSet(quantity, min, max));
    }
}
