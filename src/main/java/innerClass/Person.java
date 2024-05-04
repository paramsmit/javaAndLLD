package innerClass;

public class Person {

    private String name;

    Person(String name){
        this.name = name;
    }

    private static class Phone {
        int number;
    }

    private class Address {
        int name;

        Address(){
            Person.this.name = String.valueOf(this.name);
        }

    }

}
