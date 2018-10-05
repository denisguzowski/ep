package task1_1_controller;

import task1_1_model.Task1_1Model;
import task1_1_utilities.InputUtility;
import task1_1_view.Task1_1View;

public class Task1_1Controller {
    private Task1_1Model model;
    private Task1_1View view;

    public Task1_1Controller(Task1_1Model model, Task1_1View view) {
        this.model = model;
        this.view = view;
    }

    public void transformation(){
        model.setV(InputUtility.inputIntValueWithScanner(view));

        view.printMessangeAndResult(view.DEC, model.getV());

        model.decIntTransform(model.getV(), 2);
        view.printMessangeAndResult(view.BIN, model.getRes());

        model.decIntTransform(model.getV(), 8);
        view.printMessangeAndResult(view.OCT, model.getRes());

        model.decIntTransform(model.getV(), 16);
        view.printMessangeAndResult(view.HEX, model.getRes());
    }
}
