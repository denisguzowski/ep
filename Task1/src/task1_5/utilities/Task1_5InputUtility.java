package task1_5.utilities;

import task1_5.view.Task1_5View;

import java.util.Scanner;

public class Task1_5InputUtility {
    private static Scanner sc = new Scanner(System.in);

    public static int inputIntValueWithScanner(Task1_5View view) {
        int Int;

        view.printMessage(Task1_5View.INPUT_INT_DATA);

        while (true){
            if(sc.hasNextInt()) {
                Int = sc.nextInt();
                if (Int > 0) {
                    break;
                }else{
                    view.printMessage(Task1_5View.WRONG_INPUT_INT_DATA);
                }
            }else{
                view.printMessage(Task1_5View.WRONG_INPUT_INT_DATA);
                sc.next();
            }
        }
        return Int;
    }
}
