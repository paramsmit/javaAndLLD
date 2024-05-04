package annotation.helloworld;

public class Helloworld {
    @HelloAnnotation("MyAnnotation")
    public static void sayHello() {
        System.out.println("Hello, World!");
    }
}
