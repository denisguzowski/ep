package task8_4;

import java.util.concurrent.RecursiveTask;

public class SumOfElemsFJ extends RecursiveTask<Long> {
    private int[] localArray;
    private int from, to;

    SumOfElemsFJ(int[] localArray, int from, int to) {
        this.localArray = localArray;
        this.from = from;
        this.to = to;
    }

    @Override
    protected Long compute() {
        if((to - from) < 20){
            long localSum = 0;
            for (int i = from; i <= to; i++) {
                localSum += localArray[i];
            }
            System.out.printf("\tSumming of range from %d to %d is %s\n", from, to, localSum);
            return localSum;
        }else {
            int mid = (from + to) / 2;
            System.out.printf("Forking into two ranges: from %d to %d and from %d to %d\n", from, mid, mid + 1, to);

            SumOfElemsFJ firstHalf = new SumOfElemsFJ(localArray, from, mid);
            firstHalf.fork();

            SumOfElemsFJ secondHalf = new SumOfElemsFJ(localArray, mid + 1, to);
            long secondRes = secondHalf.compute();

            return firstHalf.join() + secondRes;
        }
    }
}
