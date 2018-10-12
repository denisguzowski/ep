package task2_1.utilities;

import task2_1.view.BooksView;

import java.util.Scanner;

public class InputUtility {
    private static Scanner sc = new Scanner(System.in);
    private static BooksView view = new BooksView();

    public static int inputIntValueWithScanner(int min, int max) {
        int Int;
        while (true){
            if(sc.hasNextInt()) {
                Int = sc.nextInt();
                if ((Int >= min)&&(Int <= max)) {
                    sc.nextLine();//clear
                    break;
                }else{
                    view.printMessage(BooksView.WRONG_INPUT_INT_DATA);
                }
            }else{
                view.printMessage(BooksView.WRONG_INPUT_INT_DATA);
                sc.next();
            }
        }
        return Int;
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
