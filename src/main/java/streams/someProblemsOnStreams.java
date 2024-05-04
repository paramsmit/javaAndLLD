package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class someProblemsOnStreams {

    public static void main(String[] args){
//        List<Integer> list = Arrays.asList(1,2);
//        System.out.println(getSum(list));
//        System.out.println(getDuplicates(List.of(1,1,2,3,4,4,5)));
//        System.out.println(getMax(List.of(-1,1,2,3,4,4,5)));
        System.out.println(sortTheList(List.of("d", "a", "x", "v")));
        System.out.println(sortTheListWithComparator(List.of("ddd", "aaaaa", "ax", "v")));


        // remove duplicate elements
        // to Map
        // sort using stream
        // flatMap
        // max -> how does comparator function works in java
        // min
        // sort the stream
        // sorted()
        // reduce methods
        // immutable pairs

    }

    public static int getSum(List<Integer> list){
        return list.stream().reduce((a,b) -> a+b).get();
    }

    public static double getAvg(List<Integer> list){
        return list.stream().mapToInt(e->e).average().getAsDouble();
    }

    public static double getAvg2(List<Integer> list){
        return list.stream()
                .map(e -> e*e)
                    .filter(e -> e > 100)
                        .mapToInt(e -> e)
                            .average()
                                .getAsDouble();
    }

    public static List<Character> getCharactersOccuringOnlyOnce(String s){
        Map<Character, Long> characterCount = s.chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isLetterOrDigit) // Filter out non-alphanumeric characters
                .map(Character::toLowerCase) // Convert to lowercase to treat 'A' and 'a' as the same character
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return characterCount.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public static List<Integer> getDuplicates(List<Integer> list){
        Map<Integer, Long> freq = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return freq.entrySet()
                .stream()
                    .filter(es -> es.getValue() > 1)
                        .map(Map.Entry::getKey)
                            .collect(Collectors.toList());
    }

    public static List<Integer> getUniqueElements(List<Integer> list){
        return list.stream().distinct().collect(Collectors.toList());
    }

    public static Integer getMax(List<Integer> list){
//        return list.stream().mapToInt(Integer::intValue).max().getAsInt();
        return list.stream().max(Integer::compareTo).get();
    }

    public static Integer getMin(List<Integer> list){
//        return list.stream().mapToInt(Integer::intValue).min().getAsInt();
        return list.stream().min(Integer::compareTo).get();
    }

    public static List<String> sortTheList(List<String> list){
        return list.stream().sorted().collect(Collectors.toList());
    }

    public static List<String> sortTheListWithComparator(List<String> list){
        return list.stream().sorted((a,b) -> a.length() - b.length()).collect(Collectors.toList());
    }

    public static List<Integer> getTheLengthOfEachString(List<String> list){
        return list.stream().map(String::length).collect(Collectors.toList());
    }

    public static String reversetheOrderOfWords(String s){
        return null;
    }

}
