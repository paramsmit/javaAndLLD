package reflection;

import java.lang.reflect.Field;

public class Tester {
    public static void main(String[] args){

        // questions may arise but its good
        // u will grow. its okay

        // Class is the type in java
        // getClass() will return the Class object
        // reference is parent class still able to access fields of Person

        Object p = new Person();
        Field[] fields = p.getClass().getDeclaredFields();

        for(Field f : fields){
            System.out.println(f.getName());
        }
    }
}
