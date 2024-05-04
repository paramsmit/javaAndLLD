package reflection.inpectClasses;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Tester {

    public static void main(String[] args) throws ClassNotFoundException {

        Object goat = new Goat();
        Class<?> clazz = goat.getClass();

        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getName());
        System.out.println(clazz.getCanonicalName());


        Class<?> c = Class.forName("reflection.inpectClasses.Goat");

        System.out.println(c.getSimpleName());
        System.out.println(c.getName());
        System.out.println(c.getCanonicalName());

        // get superclass of the class

        Class<?> superClass = c.getSuperclass();
        System.out.println(superClass.getSimpleName());

        // get package of the class in which it is defined
        Package p = c.getPackage();
        System.out.println(p.getName());


        // get interfaces implemented by the class

        Class<?>[] goatInterfaces = c.getInterfaces();
        for(Class<?> i : goatInterfaces){
            System.out.println(i.getSimpleName());
        }

        // constructor, methods and fields

        Class<?> goatClass = Class.forName("reflection.inpectClasses.Goat");
        Constructor<?>[] constructors = goatClass.getConstructors();
        System.out.println(constructors[0].getName());

        Method[] methods = goatClass.getMethods();
        for(Method m: methods){
            System.out.println(m.getName());
        }




    }
}
