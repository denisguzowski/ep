package view;

import java.util.Scanner;

public class InputUtility {
    private Scanner sc = new Scanner(System.in);
    private View view;

    public InputUtility(View view) {
        this.view = view;
    }

    public int inputIntValue(String requiredData, String wrongData, int min, int max) {
        int value;
        while (true) {
            view.printMessage(requiredData);
            if (sc.hasNextInt()) {
                value = sc.nextInt();
                if (value >= min && value <= max) {
                    break;
                }
            } else{
                sc.next();
            }
            view.printMessage(wrongData);
        }
        return value;
    }

    public String inputString(String requiredData, String wrongData, String regex){
        String data;
        while (true) {
            view.printMessage(requiredData);
            if (sc.hasNext()) {
                data = sc.next();
                if (data.matches(regex)) {
                    break;
                }
            }
            view.printMessage(wrongData);
        }
        return data;
    }
}
