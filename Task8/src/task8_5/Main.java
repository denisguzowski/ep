package task8_5;

import java.io.File;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of directory -> ");
        String dir = scanner.next();
        System.out.print("Enter key Letter -> ");
        char letter = scanner.next().charAt(0);

        Map<String, Integer> result = null;

        CounterMath counter = new CounterMath(new File(dir), letter);
        FutureTask<Map<String, Integer>> task = new FutureTask<>(counter);
        new Thread(task).start();

        try {
            result = task.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        if (result != null) {
            result.forEach((k, v) -> System.out.println("File: " + k + "\tcount of words starting with " + letter + ": " + v));
        }
    }
}
