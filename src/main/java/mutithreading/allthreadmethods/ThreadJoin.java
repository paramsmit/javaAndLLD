package mutithreading.allthreadmethods;

public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread2 t = new Thread2();
        t.start();
        t.join();
        System.out.println("main thread completed");
    }
}

class Thread2 extends Thread {
    public Thread2(){}
    public void run(){
        for(int i = 0; i < 100000; i++){
        }
        System.out.println("Thread2 completed");
    }
}

