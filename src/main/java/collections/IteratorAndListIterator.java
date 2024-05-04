package collections;

import java.util.*;

public class IteratorAndListIterator {
    public static void main(String [] args){
        ArrayList <Integer> a = new ArrayList<>();
        HashSet<Integer> s = new HashSet<>();

        a.add(1);
        a.add(2);
        a.add(3);

        s.add(1);
        s.add(2);

        ListIterator<Integer> li = a.listIterator();

        while(li.hasNext()){
            li.next();
        }

        while(li.hasPrevious()){
            li.remove();
            li.previous();
        }

        while(li.hasNext()){
            System.out.println(li.next());
        }

    }
}
