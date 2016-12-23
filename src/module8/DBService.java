package module8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexandrsemenov on 20.12.16.
 */
public class DBService<T> {
    private List<T> list = new ArrayList<>();

    T save(T t){
        list.add(t);
        return t;
    }
    T delete(T t){
        list.remove(t);
        return t;
    }
}
