package decorator.decorator2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class Tester {
    public static void main(String [] args){
        Pizza pizza = new MushRoom(new Olive(new WheatBased()));
        System.out.println(pizza.getName());

//        Reader reader = new BufferedReader(new FileReader())
    }
}

// Decorating the functionalities
// different combinations of functionalities can be clubbed together
