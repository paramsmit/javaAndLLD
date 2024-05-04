package object;

public class Equals {

    public static void main(String [] args){

        Person p = new Person("p");
        Person p1 = new Person("p");

        if(p.equals(p1)){
            System.out.println("***true");
        } else {
            System.out.println("***false");
        }
    }


}
