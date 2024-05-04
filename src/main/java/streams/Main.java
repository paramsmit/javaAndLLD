// do the stream assignment later
// jsd argued like with all guns blazing
// lambda, actions, predicate and function interface

/*
    every collection has stream() method (returns the sequencial stream)
    parallelStream() method returns the parallel multithreaded stream
    Stream.of method
    It’s also worth noting that operations on streams don’t change the source.

    forEach()
    distinct() returns the new stream object
    count()

    anymatch() returns boolean and have to just pass predicate
    allMatch()
    noneMatch()

    reduce()

    filter()
    map()
    flatMap()
    learning is happening here.

    mapToInt() => converts stream to IntStream

    collect() have to pass collector in the argument

*/

package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args){


        String[] arr = new String[]{"a","b","c"};

        Stream<String> stream  = Arrays.stream(arr);

        stream = Stream.of("a","b","c");

        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("a");
        list.add("b");
        list.add("c");

//        Stream<String> stringStream = list.stream();
//        list.parallelStream().forEach(s -> System.out.println(s));
        // this will not necessarily print in order of abc

        // intermediate operations and terminal operations

//        System.out.println(list.stream().distinct().count());

        // iterating

//        System.out.println(func(list));

        // filtering

        List<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

//        nums.stream().filter(n -> n%2==0).forEach(System.out::println);

        List<String> numStr = nums.stream().map(Object::toString)
                .collect(Collectors.toList());



//        numStr.forEach(System.out::println);

        String input = "this is the sentence";

    }



    public static boolean func(List<String> list){

        return list.stream().anyMatch(s -> s.contains("a"));

//        for (String string : list) {
//            if (string.contains("a")) {
//                return true;
//            }
//        }
//        return false;

    }



}
