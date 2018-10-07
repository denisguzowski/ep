package task1_3.view;

public class Task1_3View {
    public static final String INPUT_INT_DATA = "Enter a positive integer ";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please ";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printPyramid(int height){
        if((height < 1) || (height > 9)){
            throw new IllegalArgumentException();
        }

        int numOfChars = height;
        int numOfSpaces = height - 1;
        int symbol;

        for (int i = 0; i < height; i++) {
            symbol = 1;
            for (int j = 0; j < numOfChars; j++) {
                if(j < numOfSpaces){
                    System.out.print(" ");
                }else{
                    if(j < (height - 1)){
                        System.out.print(symbol++);
                    }else{
                        System.out.print(symbol--);
                    }
                }
            }
            System.out.println();
            numOfChars++;
            numOfSpaces--;

        }
    }
}
