package module8;

import java.util.Map;

/**
 * Created by alexandrsemenov on 20.12.16.
 */
public class TreeMap {
    private static int TEST_COUNT = 10;
    private static Task task = new Task("");

    public static void main(String[] args) {
        Map<Integer, Boolean> map = new java.util.TreeMap<>();

        int index = 0;
        while (TEST_COUNT > 0){
            boolean res = false;
            if (index % 2 == 0) res = true;
            map.put(index, res);
            index++;

            TEST_COUNT--;
        }

    }
}
