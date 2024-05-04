package builder;

public class Tester {
    public static void main(String[] args){
        User.Builder builder = new User.Builder(1, "name");
        builder.setAge(12);
        builder.setPhoneNumber(123);
        User user = new User(builder);

        User.Builder builder1 = new User.Builder(1, "name").setPhoneNumber(123).setAge(12);

        User user2 = new User.Builder(1, "name").setPhoneNumber(123).setAge(12).build();

    }
}
