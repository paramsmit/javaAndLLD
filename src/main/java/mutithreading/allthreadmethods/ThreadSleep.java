package mutithreading.allthreadmethods;

import static java.lang.Thread.sleep;

public class ThreadSleep {
    public static void main(String[] args) throws InterruptedException {
        Thread3 t = new Thread3();
        t.start();
        t.sleep(10000);
        System.out.println("main thread completed");
    }
}

class Thread3 extends Thread {
    public Thread3(){}
    public void run(){
        for(int i = 0; i < 10; i++){
        }
        System.out.println("Thread3 completed");
    }
}

