package string.immutatble;

public class StringImmutable1 {

    public static void main(String [] args){
        String a = "ABC";
        String b = a;

        b = b.toLowerCase();
        System.out.println(a);
        System.out.println(b);

//        boolean[] n2 = new boolean[-200];

        StringBuilder s1 = new StringBuilder();
        s1.append("s");

        StringBuilder s2 = s1;
        s2.append("s");

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
