package annotation.helloworld;

import java.lang.reflect.*;

public class AnnotationProcessor {
    public static void processAnnotations(Class<?> clazz) {
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(HelloAnnotation.class)) {
                HelloAnnotation annotation = method.getAnnotation(HelloAnnotation.class);
                System.out.println("Annotation Value: " + annotation.value());
            }
        }
    }
}
