package task2_2.data;

import task2_2.model.entities.Circle;
import task2_2.model.entities.Rectangle;
import task2_2.model.entities.Shape;
import task2_2.model.entities.Triangle;

public class DataSource {
    private static String[] colors = {"blue", "green", "red", "yellow", "white", "black"};

    public static Shape[] getBooks(){
        int N = 10;
        Shape[] res = new Shape[N];

        for (int i = 0; i < N; i++) {
            switch (generateRandomInt(1, 3)){
                case 1: res[i] = new Circle(colors[generateRandomInt(0,colors.length-1)], generateRandomDouble(0.0, 10.0));
                        break;
                case 2: res[i] = new Triangle(colors[generateRandomInt(0,colors.length-1)], generateRandomDouble(0.0, 10.0), generateRandomDouble(0.0, 10.0));
                        break;
                case 3: res[i] = new Rectangle(colors[generateRandomInt(0,colors.length-1)], generateRandomDouble(0.0, 10.0), generateRandomDouble(0.0, 10.0));
                        break;
            }
        }
        return res;
    }

    private static int generateRandomInt(int min, int max){
        return (int)(Math.random() * ((max - min) + 1)) + min;
    }

    private static double generateRandomDouble(double min, double max){
        return (Math.random() * ((max - min) + 1)) + min;
    }
}
