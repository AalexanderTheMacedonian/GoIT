package module8;

/**
 * Created by alexandrsemenov on 20.12.16.
 */
public class Main {
    public static void main(String[] args) {

        DBService<User> dbService = new DBService();

        User user = new User("qwe");
        dbService.save(user);

        //dbService.save("qwewe")

        DBService<String> dbService1 = new DBService<>();
        dbService1.save("Sqweqw");

    }
}
