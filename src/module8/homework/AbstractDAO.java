package module8.homework;

import java.util.List;

/**
 * Created by alexandrsemenov on 23.12.16.
 */
public interface AbstractDAO<T> {
    void save (T t);
    void delete(T t);
    void deleteAll(List T);
    void saveAll(List T);
    List<T> getList();
    void deleteById(long id);
    T get(long id);
}
