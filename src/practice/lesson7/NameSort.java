package practice.lesson7;

import java.util.Comparator;

/**
 * Created by alexandrsemenov on 12.12.16.
 */
public class NameSort implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        if (o1.getFirstName().equals(o2.getFirstName())) {
            return o1.getLastName().compareTo(o2.getLastName());
        }
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}
