package view;

import java.util.Scanner;

public class InputUtility {
    private Scanner sc = new Scanner(System.in);
    private View view;

    public InputUtility(View view) {
        this.view = view;
    }

    public int inputIntValue(int min, int max) {
        int value;
        while (true) {
            if (sc.hasNextInt()) {
                value = sc.nextInt();
                if (value >= min && value <= max) {
                    break;
                }
            } else sc.next();
            view.printMessage(ConstantMessages.WRONG_INPUT_INT_DATA);
        }
        return value;
    }

    public double inputDoubleValue(double min, double max) {
        double value;
        while (true) {
            if (sc.hasNextDouble()) {
                value = sc.nextDouble();
                if (value >= min && value <= max) {
                    break;
                }
            } else sc.next();
            view.printMessage(ConstantMessages.WRONG_INPUT_INT_DATA);
        }
        return value;
    }
}
