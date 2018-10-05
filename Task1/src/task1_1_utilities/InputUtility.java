package task1_1_utilities;

import task1_1_view.Task1_1View;

import java.util.Scanner;

public class InputUtility {
    private static Scanner sc = new Scanner(System.in);

    public static int inputIntValueWithScanner(Task1_1View view) {
        int Int = Integer.MIN_VALUE;

        view.printMessage(view.INPUT_INT_DATA);

        while (true){
            if(sc.hasNextInt()) {
                Int = sc.nextInt();
                if (Int > 0) {
                    break;
                }else{
                    view.printMessage(view.WRONG_INPUT_INT_DATA);
                }
            }else{
                view.printMessage(view.WRONG_INPUT_INT_DATA);
                sc.next();
            }
        }
        return Int;
    }
}