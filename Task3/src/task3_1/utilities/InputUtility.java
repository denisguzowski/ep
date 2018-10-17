package task3_1.utilities;

import task3_1.view.ToysView;

import java.util.Scanner;

public class InputUtility {
    private static Scanner sc = new Scanner(System.in);
    private static ToysView view = new ToysView();

    public static int inputIntValueWithScanner(int min, int max) {
        int Int;
        while (true){
            if(sc.hasNextInt()) {
                Int = sc.nextInt();
                if ((Int >= min)&&(Int <= max)) {
                    sc.nextLine();//clear
                    break;
                }else{
                    view.printMessage(ToysView.WRONG_INPUT_INT_DATA);
                }
            }else{
                view.printMessage(ToysView.WRONG_INPUT_INT_DATA);
                sc.next();
            }
        }
        return Int;
    }

    public static double inputDoubleValueWithScanner(double min, double max) {
        double d;
        while (true){
            if(sc.hasNextDouble()) {
                d = sc.nextDouble();
                if ((d >= min)&&(d <= max)) {
                    sc.nextLine();//clear
                    break;
                }else{
                    view.printMessage(ToysView.WRONG_INPUT_INT_DATA);
                }
            }else{
                view.printMessage(ToysView.WRONG_INPUT_INT_DATA);
                sc.next();
            }
        }
        return d;
    }
}
