package exceptions;

public class Finally1 {

    public static void main(String[] args){

        try{
            int x = 25/0;
        } catch(Exception e){
            System.out.println("catch");
            int y = 24/0;
        } finally {
            System.out.println("finall");
        }

        System.out.println("outside");
    }



}
