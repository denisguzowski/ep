package task1_2.utilities;

import task1_2.view.Task1_2View;

import java.util.Scanner;

public class Task1_2InputUtility {
    private static Scanner sc = new Scanner(System.in);

    public static int inputIntValueWithScanner(Task1_2View view) {
        int Int;

        view.printMessage(Task1_2View.INPUT_INT_DATA);

        while (true){
            if(sc.hasNextInt()) {
                Int = sc.nextInt();
                if (Int > 0) {
                    break;
                }else{
                    view.printMessage(Task1_2View.WRONG_INPUT_INT_DATA);
                }
            }else{
                view.printMessage(Task1_2View.WRONG_INPUT_INT_DATA);
                sc.next();
            }
        }
        return Int;
    }
}
