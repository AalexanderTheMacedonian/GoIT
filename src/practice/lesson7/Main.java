package practice.lesson7;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by alexandrsemenov on 12.12.16.
 */
public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            users.add(new User("FirstName" + i, "LastName" + i, i));
        }

        users.sort(new NameSort());

        Collections.sort(users);
        deleteMinAge(users);


        // users.stream().filter((item -> item.getAge()>21));
    }

    private static List<User> deleteMinAge(List<User> users) {
        List<User> res = new ArrayList<>();
        for (User user : users) {
            if (user.getAge() >= 21) res.add(user);
        }
        return res;
    }
}
