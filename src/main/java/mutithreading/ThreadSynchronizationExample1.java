package mutithreading;

public class ThreadSynchronizationExample1 {
    public static void main(String[] args) {
        SharedCounter counter = new SharedCounter();

        Thread thread1 = new IncrementThread(counter);
        Thread thread2 = new IncrementThread(counter);

        thread1.start();
        thread2.start();

        // Wait for both threads to complete
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Counter Value: " + counter.getCount());
    }
}

class SharedCounter {
    private int count = 0;

    // Increment the counter safely using synchronized method
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class IncrementThread extends Thread {
    private SharedCounter counter;

    public IncrementThread(SharedCounter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 100000; i++) {
            counter.increment();
        }
    }
}

