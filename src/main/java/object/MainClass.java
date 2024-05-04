package object;

public class MainClass {

    public static void main(String [] args){

        // why hashcode and equals should be consistent with each other?

        Person p1 = new Person("p1");
        Person p2 = new Person("p1");
        Person p3 = p2;

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());

        if(p1.equals(p2)){
            System.out.println("p1 equals p2");
        } else {
            System.out.println("p2 not equals p2");
        }
    }
}
