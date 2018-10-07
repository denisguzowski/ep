package task1_3.utilities;

import task1_3.view.Task1_3View;

import java.util.Scanner;

public class InputUtility {
    private static Scanner sc = new Scanner(System.in);

    public static int inputIntValueWithScanner(Task1_3View view) {
        int Int;

        view.printMessage(Task1_3View.INPUT_INT_DATA);

        while (true){
            if(sc.hasNextInt()) {
                Int = sc.nextInt();
                if ((Int >= 1)&&(Int <= 9)) {
                    break;
                }else{
                    view.printMessage(Task1_3View.WRONG_INPUT_INT_DATA);
                }
            }else{
                view.printMessage(Task1_3View.WRONG_INPUT_INT_DATA);
                sc.next();
            }
        }
        return Int;
    }
}
