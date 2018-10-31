package model.utilities;

public class RandomNumberGenerator {
    private static double generateRandomDouble(double min, double max) {
        return Math.random() * ((max - min) + 1) + min;
    }

    public static Integer[] getRandomIntegerArray(int size, int min, int max){
        Integer[] arr = new Integer[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)generateRandomDouble(min, max);
        }
        return arr;
    }
}
