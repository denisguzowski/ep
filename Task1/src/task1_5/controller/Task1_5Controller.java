package task1_5.controller;

import task1_5.model.Task1_5Model;
import task1_5.utilities.Task1_5InputUtility;
import task1_5.view.Task1_5View;

public class Task1_5Controller {

    public void action(){
        Task1_5View view = new Task1_5View();
        Task1_5Model model = new Task1_5Model(Task1_5InputUtility.inputIntValueWithScanner(view));

        model.rotate90degMatrix();

        view.printMessage(Task1_5View.MATRIX);
        view.printMatrix(model.getMatrix());

        view.printMessage(Task1_5View.ROTATED_MATRIX);
        view.printMatrix(model.getRotatedMatrix());
    }
}
