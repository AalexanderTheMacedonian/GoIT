package module10.homework;

import java.util.List;

/**
 * Created by alexandrsemenov on 10.01.17.
 */
public class Task3 {
    public static void main(String[] args) {
        Object object = null;
        //object.notify();

        try {
            object.notify();
        } catch (NullPointerException e) {
            System.out.println("Complete");
        }
    }
}
