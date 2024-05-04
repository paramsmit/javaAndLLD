package mutithreading;

public class Helloworld {

    public static void main(String [] args){

        print1 p1 = new print1();
        print2 p2 = new print2();

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);

        t1.start();
        t2.start();
    }

}

class print1 implements Runnable {
    public void run(){
        System.out.println("print1");
    }
}

class print2 implements Runnable {
    public void run(){
        System.out.println("print2");
    }
}