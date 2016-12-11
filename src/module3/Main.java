package module3;

/**
 * Created by alexandrsemenov on 09.11.16.
 */
public class Main {


    public static void main(String[] args) {

        testUser();

    }

    static void testUser() {

        User user;
        user = new User(55388965, "Denis", 10, "Test");

        System.out.println(user.getName());
        System.out.println(user.getAge());
        System.out.println(user.getCompany());

        //user.id = 9999;
        long userId = user.getId();
        //user.setId();

        //user.name = "MyName";
        String name = user.getName();
        user.setName("Aaa");



        user.speak();
        user.sendEmail();

    }

}
