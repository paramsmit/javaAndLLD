package annotation.notnull;

import java.lang.reflect.*;

public class ValidationUtils {

    public static void validateNotNullFields(Object object) throws IllegalAccessException {
        Class<?> clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(NotNull.class)) {
                field.setAccessible(true);
                Object value = field.get(object);
                if (value == null) {
                    NotNull annotation = field.getAnnotation(NotNull.class);
                    String message = annotation.message();
                    throw new IllegalArgumentException(message);
                }
            }
        }
    }
}
