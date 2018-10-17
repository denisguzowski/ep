package task3_1.controller;

import task3_1.data.DataSource;
import task3_1.model.GameRoom;
import task3_1.model.entity.Toy;
import task3_1.utilities.InputUtility;
import task3_1.view.ToysView;

public class Controller {
    private GameRoom<Toy> model = new GameRoom<>();
    private ToysView view = new ToysView();

    public void run(){
        model.setToys(DataSource.getToys());

        cycle:
        while (true){
            view.printMessage(ToysView.MENU);
            int inputInt = InputUtility.inputIntValueWithScanner(0, 4);

            switch (inputInt){
                case 0: view.printMessage(ToysView.ALL_TOYS);
                        view.printToys(model.getToys());
                        break;
                case 1: model.sortByName();
                        view.printToys(model.getToys());
                        break;
                case 2: view.printMessage(String.valueOf(model.totalCost()));
                        break;
                case 3: view.printMessage(ToysView.MIN_PRICE);
                        double d1 = InputUtility.inputDoubleValueWithScanner(0.0, Double.MAX_VALUE);
                        view.printMessage(ToysView.MAX_PRICE);
                        double d2 = InputUtility.inputDoubleValueWithScanner(d1, Double.MAX_VALUE);

                        view.printMessage(ToysView.MIN_AGE);
                        int i1 = InputUtility.inputIntValueWithScanner(0, Integer.MAX_VALUE);
                        view.printMessage(ToysView.MAX_AGE);
                        int i2 = InputUtility.inputIntValueWithScanner(i1, Integer.MAX_VALUE);

                        searchToysByPriceAndAge(model.getToys(), d1, d2, i1, i2);
                        break;
                case 4: view.printMessage(ToysView.GOODBYE);
                        break cycle;
            }

        }

    }

    private <T extends Toy> void searchToysByPriceAndAge(T[] arr, double pMin, double pMax, int aMin, int aMax) {
        Toy[] result = model.getToysByAge(model.getToysByPrice(arr, pMin, pMax), aMin, aMax);
        if (result.length == 0) {
            view.printMessage(ToysView.NOTHING_FOUND);
        } else {
            view.printMessage(ToysView.RESULT);
            view.printToys(result);
        }
    }
}
