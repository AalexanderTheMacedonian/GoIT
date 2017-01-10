package module10.exceptions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexandrsemenov on 10.01.17.
 */
public class SecondExample {
    static List<User> users = new ArrayList<>();

    public static void main(String[] args) {
        users.add(new User("222","Kiev","222"));
        users.add(new User("222",null,"222"));

        System.out.println(calc("Kiev"));
    }

    private static int calc(String city) {
        int counter = 0;
        int counter1 = 0;
        for (User user: users) {
            try {
                if(user.getCity().equals(city))
                    counter++;

                if(user.getPassword().length() < 5)
                    counter1++;

            } catch (NullPointerException e) {
                System.out.println("warning");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("critical error");
                break;
            } finally {
                System.out.println("finally");
            }
        }
        return counter;
    }
}
