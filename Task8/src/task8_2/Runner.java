package task8_2;

public class Runner {
    public static Integer value = 0;
    public static boolean flag = false;
    public void run(){
        new Thread( () -> {
            synchronized (this){
                for (int i = 0; i < 100; i++) {

                    while (flag){
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    Runner.value++;
                    flag = true;
                    notify();
                }
            }
        }).start();

        new Thread( () -> {
            synchronized (this){
                for (int i = 0; i < 100; i++) {

                    while (!flag){
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Runner.value);
                    flag = false;
                    notify();
                }
            }
        }).start();
    }
}
