package task1_2.view;

public class Task1_2View {
    public static final String INPUT_INT_DATA = "Enter a positive integer: ";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please ";
    public static final String SCOPE = "From 1 to ";
    public static final String RESULT = "Perfect numbers are: ";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageAndResult(String message, int[] result){
        System.out.println(message);

        for (int res : result) {
            if(res == 0){
                break;
            }
            System.out.println(res);
        }
    }

    public void printMessageAndNumber(String message, int number){
        System.out.println(message + number);
    }
}
