package annotation.notnull;

public class AnnotationValidationDemo {
    public static void main(String[] args) throws IllegalAccessException {
        MyClass myObj = new MyClass();
        myObj.setName(null);

        try {
            ValidationUtils.validateNotNullFields(myObj);
            System.out.println("Validation passed");
        } catch (IllegalArgumentException e) {
            System.out.println("Validation failed: " + e.getMessage());
        }
    }
}
