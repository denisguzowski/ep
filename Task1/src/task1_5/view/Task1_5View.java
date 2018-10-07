package task1_5.view;

public class Task1_5View {
    public static final String INPUT_INT_DATA = "Enter a square matrix size: ";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please ";
    public static final String MATRIX = "Matrix is: ";
    public static final String ROTATED_MATRIX = "Rotated 90 deg matrix is: ";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] >= 0){
                    System.out.print(" " + matrix[i][j] + " ");
                }else{
                    System.out.print(matrix[i][j]+ " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
