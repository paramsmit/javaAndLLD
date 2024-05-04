package garbageCollection;

class MyObject {
    MyObject() {
        System.out.println("MyObject is being created.");
    }

    @Override
    protected void finalize() {
        System.out.println("MyObject is being finalized.");
    }
}

public class GarbageCollectionEx1 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new MyObject();
        }

        System.gc();
    }
}
