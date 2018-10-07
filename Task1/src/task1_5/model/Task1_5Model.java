package task1_5.model;

public class Task1_5Model {
    private int size;
    private int[][] matrix;
    private int[][] rotatedMatrix;
    private final int MAX_VAL = 9;
    private final int MIN_VAL = -9;

    public int[][] getMatrix() {
        return matrix;
    }

    public int[][] getRotatedMatrix() {
        return rotatedMatrix;
    }

    public Task1_5Model(int size) {
        this.size = size;
        matrix = new int[size][size];
        fillMatrix(matrix, MIN_VAL, MAX_VAL);
    }

    public Task1_5Model() {
        size = 1;
        matrix = new int[size][size];
        fillMatrix(matrix, MIN_VAL, MAX_VAL);
    }

    public void rotate90degMatrix(){
        rotatedMatrix = new int[size][size];
        for (int j = size - 1; j >= 0; j--) {
            for (int i = 0; i < size; i++) {
                rotatedMatrix[size - 1 - j][i] = matrix[i][j];
            }
        }
    }

    private int generateRandomInt(int min, int max){
        return (int)(Math.random() * ((max - min) + 1)) + min;
    }

    private void fillMatrix(int[][] matrix, int min, int max){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = generateRandomInt(min, max);
            }
        }
    }
}
