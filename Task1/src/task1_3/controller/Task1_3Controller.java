package task1_3.controller;

import task1_3.model.Task1_3Model;
import task1_3.view.Task1_3View;
import task1_3.utilities.InputUtility;

public class Task1_3Controller {
    private Task1_3Model model;
    private Task1_3View view;

    public Task1_3Controller(Task1_3Model model, Task1_3View view) {
        this.model = model;
        this.view = view;
    }

    public void action(){
        model.setHeight(InputUtility.inputIntValueWithScanner(view));
        view.printPyramid(model.getHeight());
    }
}
