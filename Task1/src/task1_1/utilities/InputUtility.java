package task1_1.utilities;

import task1_1.view.Task1_1View;

import java.util.Scanner;

public class InputUtility {
    private static Scanner sc = new Scanner(System.in);

    public static int inputIntValueWithScanner(Task1_1View view) {
        int Int;

        view.printMessage(Task1_1View.INPUT_INT_DATA);

        while (true){
            if(sc.hasNextInt()) {
                Int = sc.nextInt();
                if (Int > 0) {
                    break;
                }else{
                    view.printMessage(Task1_1View.WRONG_INPUT_INT_DATA);
                }
            }else{
                view.printMessage(Task1_1View.WRONG_INPUT_INT_DATA);
                sc.next();
            }
        }
        return Int;
    }
}