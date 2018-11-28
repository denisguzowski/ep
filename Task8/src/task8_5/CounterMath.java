package task8_5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.*;

public class CounterMath implements Callable <Map<String, Integer>>{
    private File dir;
    private Character letter;

    CounterMath(File dir, Character letter) {
        this.dir = dir;
        this.letter = letter;
    }

    private int search(File ff){
        try(Scanner sc = new Scanner(new FileInputStream(ff))){
            int counter = 0;
            while (sc.hasNextLine()){
                String str = sc.nextLine();
                String[] tempArr = str.split(" ");
                for (String s : tempArr) {
                    if(s.length() > 0){
                        if(s.charAt(0) == letter){
                            counter++;
                        }
                    }
                }
            }
            return counter;
        } catch (FileNotFoundException e) {
            return -1;
        }
    }

    @Override
    public Map<String, Integer> call() throws Exception {
        Map<String, Integer> finalRes = new HashMap<>();
        try{
            File[] files = dir.listFiles();
            ArrayList<Future<Map<String, Integer>>> tempRes = new ArrayList<>();

            if (files != null) {
                for(File ff : files){
                    if(ff.isDirectory()){
                        CounterMath counter = new CounterMath(ff, letter);
                        FutureTask<Map<String, Integer>> task = new FutureTask<>(counter);
                        tempRes.add(task);
                        new Thread(task).start();
                    }
                    if(ff.isFile()){
                        if(search(ff) > 0){
                            finalRes.put(ff.getCanonicalPath(), search(ff));
                        }
                    }
                }
            }
            for (Future<Map<String, Integer>> res : tempRes){
                finalRes.putAll(res.get());
            }
        }catch (ExecutionException | InterruptedException e){
            e.printStackTrace();
        }
        return finalRes;
    }
}
