package annotation.notnull;

public class MyClass {

    @NotNull
    private String name;

    public void setName(@NotNull String name) {
        this.name = name;
    }

    @NotNull
    public String getName() {
        return name;
    }
}
