package task3_2.utilities;

import task3_2.view.StoreView;

import java.util.Scanner;

public class InputUtility {
    private static Scanner sc = new Scanner(System.in);
    private static StoreView view = new StoreView();

    public static int inputIntValueWithScanner(int min, int max) {
        int Int;
        while (true){
            if(sc.hasNextInt()) {
                Int = sc.nextInt();
                if ((Int >= min)&&(Int <= max)) {
                    sc.nextLine();//clear
                    break;
                }else{
                    view.printMessage(StoreView.WRONG_INPUT_INT_DATA);
                }
            }else{
                view.printMessage(StoreView.WRONG_INPUT_INT_DATA);
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
                    view.printMessage(StoreView.WRONG_INPUT_INT_DATA);
                }
            }else{
                view.printMessage(StoreView.WRONG_INPUT_INT_DATA);
                sc.next();
            }
        }
        return d;
    }

    public static String inputStringWithScanner() {
        String str;
        while(true){
            if(sc.hasNext()){
                str = sc.nextLine();
                break;
            }
        }
        return str;
    }
}
