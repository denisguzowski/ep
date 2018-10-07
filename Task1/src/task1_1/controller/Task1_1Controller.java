package task1_1.controller;

import task1_1.model.Task1_1Model;
import task1_1.utilities.InputUtility;
import task1_1.view.Task1_1View;

public class Task1_1Controller {
    private Task1_1Model model;
    private Task1_1View view;

    public Task1_1Controller(Task1_1Model model, Task1_1View view) {
        this.model = model;
        this.view = view;
    }

    public void transformation(){
        model.setV(InputUtility.inputIntValueWithScanner(view));

        view.printMessageAndResult(Task1_1View.DEC, model.getV());

        model.decIntTransform(model.getV(), 2);
        view.printMessageAndResult(Task1_1View.BIN, model.getRes());

        model.decIntTransform(model.getV(), 8);
        view.printMessageAndResult(Task1_1View.OCT, model.getRes());

        model.decIntTransform(model.getV(), 16);
        view.printMessageAndResult(Task1_1View.HEX, model.getRes());
    }
}
