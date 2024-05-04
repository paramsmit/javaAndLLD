/*
*
* Solid
* single responsibility
* open close
* liskov substitution
* interface segregation
* dependency injection
* */


package mutithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class ArraySum {
    public static void main(String [] args){

        int [] arr = {1,2,3,4,5,6,7,8,9,10};

        int numOfThreads = 4;
        int arrlength = arr.length;
        int chunkSize = arrlength / numOfThreads;

        AtomicInteger sum = new AtomicInteger(0);

        Thread [] threads = new Thread[numOfThreads];

        for(int i = 0; i < numOfThreads; i++){
            int start = i*chunkSize;
            int end = (i == numOfThreads - 1) ? arrlength : (i+1)*chunkSize;
            threads[i] = new Thread(new SumCalculator(arr, start, end, sum));
            threads[i].start();
        }

        for(Thread thread: threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Sum: " + sum.get());
    }
}

class SumCalculator implements Runnable {

    private final int[] array;
    private final int start;
    private final int end;
    private final AtomicInteger sum;

    public SumCalculator(int[] array, int start, int end, AtomicInteger sum) {
        this.array = array;
        this.start = start;
        this.end = end;
        this.sum = sum;
    }

    public void run() {
        int localSum = 0;
        for (int i = start; i < end; i++) {
            localSum += array[i];
        }
        sum.addAndGet(localSum);
    }
}
