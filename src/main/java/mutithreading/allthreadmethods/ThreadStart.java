package mutithreading.allthreadmethods;

public class ThreadStart {
    public static void main(String [] args){
        Thread1 t = new Thread1();
        t.start();
    }
}

class Thread1 extends Thread {
    public void run(){
        System.out.println("thread run");
    }
}
