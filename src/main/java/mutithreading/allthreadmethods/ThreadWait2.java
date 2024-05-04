package mutithreading.allthreadmethods;

import static java.lang.Thread.sleep;

public class ThreadWait2 {
    public static void main(String [] args) throws InterruptedException {

        Light l = new Light();

        Thread4 t1 = new Thread4(l);
        Thread4 t2 = new Thread4(l);
        Thread5 t3 = new Thread5(l);

        t1.setName("t1");
        t2.setName("t2");

        t2.start();
        t1.start();

        sleep(3000);
        t3.start();
    }
}

class Thread4 extends Thread {

    Light l;

    public Thread4(Light l1) {
        this.l = l1;
    }

    @Override
    public void run() {
        try {
            l.start();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Thread5 extends Thread {
    Light l;

    public Thread5(Light l1) {
        this.l = l1;
    }

    @Override
    public void run() {
        l.restart();
    }
}

class Light {
    public synchronized void start() throws InterruptedException {
        wait();
        System.out.println(Thread.currentThread().getName() + " restarted");
    }

    public synchronized void restart() {
        notify();
    }
}



