package object.hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainClass {

    public static void main(String [] args){

        Set<Person> s = new HashSet<>();

        Person p1 = new Person("p1");
        Person p2 = new Person("p2");

        s.add(p1);
        s.add(p2);

    }
}
