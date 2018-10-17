package task3_1.model;

import task3_1.model.entity.Toy;

import java.util.Arrays;
import java.util.Comparator;

public class GameRoom <T extends Toy>{
    private T[] toys;

    public T[] getToys() {
        return toys;
    }

    public void setToys(T[] toys) {
        this.toys = toys;
    }

    public void sortByName(){
        Arrays.sort(toys, new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    public double totalCost(){
        double tCost = 0;
        for (T arr:toys) {
            tCost += arr.getPrice();
        }
        return tCost;
    }

    public T[] getToysByPrice(T[] t, double min, double max){
        T[] result = Arrays.copyOf(t, t.length);
        int counter = 0;

        for (T arr:t) {
            if((arr.getPrice() >= min) && ((arr.getPrice() <= max))){
                result[counter++] = arr;
            }
        }

        return Arrays.copyOf(result, counter);
    }

    public T[] getToysByAge(T[] t, double min, double max){
        T[] result = Arrays.copyOf(t, t.length);
        int counter = 0;

        for (T arr:t) {
            if((arr.getAge() >= min) && ((arr.getAge() <= max))){
                result[counter++] = arr;
            }
        }

        return Arrays.copyOf(result, counter);
    }


}
