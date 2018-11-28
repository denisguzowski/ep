package task8_4;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args){
        int N = 1_000_000;
        int numberOfThreads = 8;
        int[] array = new Random().ints(N, 0, 100).toArray();


        ForkJoinPool pool = new ForkJoinPool(numberOfThreads);
        long sum = pool.invoke(new SumOfElemsFJ(array, 0, N - 1));
        System.out.println("Sum = " + sum);

    }
}
