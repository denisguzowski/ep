package util;

import view.BookView;

import java.util.Scanner;

public class InputUtility {
    private Scanner sc = new Scanner(System.in);
    private BookView view;

    public InputUtility(BookView view) {
        this.view = view;
    }

    public int inputIntValue(String requiredDataMessage, String wrongDataMessage, int min, int max) {
        int value;
        while (true) {
            view.printMessage(requiredDataMessage);
            if (sc.hasNextInt()) {
                value = sc.nextInt();
                if ((value >= min) && (value <= max)) {
                    break;
                }
            } else{
                sc.next();
            }
            view.printMessage(wrongDataMessage);
        }
        return value;
    }

    public String inputString(String requiredDataMessage, String wrongDataMessage, String regex){
        String data;
        while (true) {
            view.printMessage(requiredDataMessage);
            if (sc.hasNext()) {
                data = sc.next();
                if (data.matches(regex)) {
                    break;
                }
            }
            view.printMessage(wrongDataMessage);
        }
        return data;
    }
}
