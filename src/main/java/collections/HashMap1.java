package collections;

import java.util.*;

public class HashMap1 {

    public static void main(String[] args){

        HashMap<Integer, Integer> mp = new HashMap<>();

        mp.put(2,2);
        mp.put(3,3);
        mp.put(-1,-1);
        mp.put(1,1);


        Set<Map.Entry<Integer,Integer>> s = mp.entrySet();

        // no order is preserved here of the keys
        // seems it will sort the keys
        // and there is no iterator for the map as well.

        for (Map.Entry<Integer, Integer> e : s) {
            System.out.println(e.getKey());
        }


        LinkedHashMap<Integer,Integer> lmp = new LinkedHashMap<>();

        lmp.put(2,2);
        lmp.put(3,3);
        lmp.put(1,1);
        lmp.put(-1,-1);

        Set<Map.Entry<Integer,Integer>> s1 = lmp.entrySet();


        // order of input is preserved here
        for (Map.Entry<Integer, Integer> e : s1) {
            System.out.println(e.getKey());
        }











    }

}

