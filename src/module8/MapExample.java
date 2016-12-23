package module8;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by alexandrsemenov on 20.12.16.
 */
public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Jan", 31);
        map.put("Feb", 28);
        map.put("Mar", 30);
        map.put("Apr", 30);

        map.get("Feb");
        map.remove("Mar");

        map.keySet();
        map.values();
    }
}
