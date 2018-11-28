package task8_3;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Runner {
    Map<Integer, Integer> map;
    final int COUNT = 1000;

    public void run(){
        map = new HashMap<>();
        Thread[] threadsWrite = new Thread[COUNT];
        Thread[] threadsRead = new Thread[COUNT];
        for (int i = 0; i < COUNT; i++) {
            int j = i;

            threadsWrite[i] = new Thread( () -> {
                synchronized (this.map){
                    map.put(j,j);
                }
            });

            threadsRead[i] = new Thread( () -> {
                synchronized (this.map){
                    map.get(j);
                }
            });
        }

        long startTime = System.nanoTime();
        for (int i = 0; i < COUNT; i++) {
            threadsWrite[i].start();
            threadsRead[i].start();
        }

        for (int i = 0; i < COUNT; i++) {

            try {
                threadsWrite[i].join();
                threadsRead[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long endTime = System.nanoTime();
        System.out.println("Time = " + (endTime - startTime) / 1_000_000 + " ms");
    }

    public void run1(){
        map = new ConcurrentHashMap<>();
        Thread[] threadsWrite = new Thread[COUNT];
        Thread[] threadsRead = new Thread[COUNT];
        for (int i = 0; i < COUNT; i++) {
            int j = i;

            threadsWrite[i] = new Thread( () -> {
                map.put(j,j);
            });

            threadsRead[i] = new Thread( () -> {
                map.get(j);
            });
        }

        long startTime = System.nanoTime();
        for (int i = 0; i < COUNT; i++) {
            threadsWrite[i].start();
            threadsRead[i].start();
        }

        for (int i = 0; i < COUNT; i++) {

            try {
                threadsWrite[i].join();
                threadsRead[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long endTime = System.nanoTime();
        System.out.println("Concurrent Time = " + (endTime - startTime) / 1_000_000 + " ms");
    }
}
