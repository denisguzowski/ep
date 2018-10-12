package task2_2.utilities;

import task2_2.view.FiguresView;

import java.util.Scanner;

public class InputUtility {
    private static Scanner sc = new Scanner(System.in);
    private static FiguresView view = new FiguresView();

    public static int inputIntValueWithScanner(int min, int max) {
        int Int;
        while (true){
            if(sc.hasNextInt()) {
                Int = sc.nextInt();
                if ((Int >= min)&&(Int <= max)) {
                    break;
                }else{
                    view.printMessage(FiguresView.WRONG_INPUT_INT_DATA);
                }
            }else{
                view.printMessage(FiguresView.WRONG_INPUT_INT_DATA);
            }
            sc.nextLine();//clear
        }
        return Int;
    }
}
