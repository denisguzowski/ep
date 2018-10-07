package task1_2.controller;

import task1_2.model.Task1_2Model;
import task1_2.utilities.Task1_2InputUtility;
import task1_2.view.Task1_2View;

public class Task1_2Controller {
    private Task1_2View view;
    private Task1_2Model model;

    {
        view = new Task1_2View();
        model = new Task1_2Model();
    }

    public void action(){
        model.setEndOfCalc(Task1_2InputUtility.inputIntValueWithScanner(view));
        model.perfectNumbers();

        view.printMessageAndNumber(Task1_2View.SCOPE, model.getEndOfCalc());
        view.printMessageAndResult(Task1_2View.RESULT, model.getResult());
    }

}
