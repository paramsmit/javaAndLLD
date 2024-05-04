package builder;

/*
*
* cannot create static class outside
*
* just the member type class is static
*
* */

public class User {

    final int id;
    final String name;
    final int phoneNumber; // opt
    final int age; // opt

    public User(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.phoneNumber = builder.phoneNumber;
        this.age = builder.age;
    }

    public static class Builder{

        final int id;
        final String name;
        int phoneNumber;
        int age;

        public Builder(int id, String name){
            this.id = id;
            this.name = name;
            phoneNumber = 0;
            age = 0;
        }

        public Builder setPhoneNumber(int phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setAge(int age){
            this.age = age;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}
