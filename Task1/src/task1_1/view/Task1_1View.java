package task1_1.view;

public class Task1_1View {
    public static final String INPUT_INT_DATA = "Enter a positive integer ";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please ";
    public static final String DEC = "DEC ";
    public static final String BIN = "BIN ";
    public static final String OCT = "OCT ";
    public static final String HEX = "HEX ";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageAndResult(String message, char[] result){
        System.out.print(message);

        for (char res:result) {
            System.out.print(res);
        }
        System.out.println();
    }

    public void printMessageAndResult(String message, int result){
        System.out.println(message + result);
    }
}
