package task2_2.controller;

import task2_2.data.DataSource;
import task2_2.model.Figures;
import task2_2.utilities.InputUtility;
import task2_2.view.FiguresView;

public class Controller {
    private Figures model = new Figures();
    private FiguresView view = new FiguresView();

    public void run(){
        model.setFigures(DataSource.getBooks());

        cycle:
        while (true){
            view.printMessage(FiguresView.MENU);
            int inputInt = InputUtility.inputIntValueWithScanner(0, 5);

            switch (inputInt){
                case 0: view.printMessage(FiguresView.ALL_FIGURES);
                        view.printFigures(model.getFigures());
                        break;
                case 1: view.printMessage(FiguresView.RESULT);
                        view.printMessage(String.valueOf(model.getTotalArea()));
                        break;
                case 2: view.printMessage(FiguresView.SUBMENU);
                        int inputInt1 = InputUtility.inputIntValueWithScanner(1, 3);
                        view.printMessage(FiguresView.RESULT);
                        view.printMessage(String.valueOf(model.getTotalAreaByGivenType(inputInt1)));
                        break;
                case 3: view.printMessage(FiguresView.RESULT);
                        view.printFigures(model.getFiguresSortedByArea());
                        break;
                case 4: view.printMessage(FiguresView.RESULT);
                        view.printFigures(model.getFiguresSortedByColor());
                        break;
                case 5: view.printMessage(FiguresView.GOODBYE);
                        break cycle;
            }

        }
    }
}
