package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;

public class ArrayList_VS_LinkedList {
    public static void main(String [] args){

        LinkedList<Long> a = new LinkedList<>();

        for(Long i = 0L; i < 10000000L; i++){
            a.add(i);
        }

        Long startTime = new Date().getTime();
        a.add(0,1L);
        Long endTime = new Date().getTime();

        System.out.println(endTime - startTime);

    }
}
