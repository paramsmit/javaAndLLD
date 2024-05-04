package polymorphism;

import java.util.ArrayList;

public class Overloading1 {

    public static void main(String [] args){
        // method1(null);
        // this will be ambiguous method calls
    }

    public void method1(ArrayList<String> a){
        System.out.println("list");
    }

    public void method1(String s){
        System.out.println("s");
    }

    public void method1(Object o){
        System.out.println("o");
    }
}
