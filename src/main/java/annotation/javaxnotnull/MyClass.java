package annotation.javaxnotnull;

import javax.validation.constraints.NotNull;

public class MyClass {

    String name;

    public void setName(@NotNull String name) {
        this.name = name;
        System.out.println("null name assigned");
    }
}
