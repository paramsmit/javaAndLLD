package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {
    public static void main( String [] args){
        ArrayList<Integer> a = new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);

        Iterator i = a.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }

    }
}
