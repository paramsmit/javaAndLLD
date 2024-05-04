package mutithreading;

public class RaceSimulation {
    public static void main(String[] args) {
        Runner runner1 = new Runner("Runner 1");
        Runner runner2 = new Runner("Runner 2");

        runner1.start();
        runner2.start();
        System.out.println("main exists");
    }
}

class Runner extends Thread {
    private String name;

    public Runner(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(name + " has completed " + i + " meters");
//            try {
//                Thread.sleep(1000); // Simulating the time taken to run 1 meter
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
        System.out.println(name + " has finished the race!");
    }
}
