package task3_2.controller;

import task3_2.model.Store;
import task3_2.utilities.InputUtility;
import task3_2.view.StoreView;

public class Controller {
    private Store model = new Store();
    private StoreView view = new StoreView();

    public void run(){
        cycle:
        while (true){
            view.printMessage(StoreView.MENU);
            int inputInt = InputUtility.inputIntValueWithScanner(0, 6);

            /*
            !!! To do
            function for each branch of switch;
            check exceptional situations;
             */

            switch (inputInt){
                case 0: view.printMessage(StoreView.ALL);
                        view.printMessage(model.toString());
                        break;
                case 1: view.printMessage(StoreView.DEPT_NAME);
                        String s1 = InputUtility.inputStringWithScanner();
                        view.printMessage(StoreView.GOODS);
                        String s2 = InputUtility.inputStringWithScanner();
                        view.printMessage(StoreView.SERVICES);
                        String s3 = InputUtility.inputStringWithScanner();
                        view.printMessage(StoreView.LOCATION);
                        String s4 = InputUtility.inputStringWithScanner();
                        model.addDepartment(s1, s2, s3, s4);
                        break;
                case 2: view.printMessage(StoreView.DEPT_NAME);
                        String s5 = InputUtility.inputStringWithScanner();
                        model.removeDepartmentByName(s5);
                        break;
                case 3: model.sortDepartmentsByName();
                        break;
                case 4: view.printMessage(StoreView.DEPT_NAME);
                        String s6 = InputUtility.inputStringWithScanner();
                        view.printMessage(StoreView.PROD_NAME);
                        String s7 = InputUtility.inputStringWithScanner();
                        view.printMessage(StoreView.AMOUNT);
                        int i1 = InputUtility.inputIntValueWithScanner(0, Integer.MAX_VALUE);
                        view.printMessage(StoreView.PRICE);
                        double d1 = InputUtility.inputDoubleValueWithScanner(0.0, Double.MAX_VALUE);
                        model.deliveryOfGoods(s6, s7, i1, d1);
                        break;
                case 5: view.printMessage(StoreView.DEPT_NAME);
                        String s8 = InputUtility.inputStringWithScanner();
                        view.printMessage(StoreView.PROD_NAME);
                        String s9 = InputUtility.inputStringWithScanner();
                        model.liquidationOfGoods(s8, s9);
                        break;
                case 6: view.printMessage(StoreView.GOODBYE);
                    break cycle;
            }

        }
    }
}
