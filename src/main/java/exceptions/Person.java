package exceptions;

public class Person {
    public static void main(String [] args){
        try{
            System.out.println("try");
            return;
        } catch (RuntimeException e){

        }
        finally {
            System.out.println("finally executed");
        }
        System.out.println("after try catch");
    }
}
