package module8.homework;

import module8.Task;

import java.util.List;

/**
 * Created by alexandrsemenov on 23.12.16.
 */
public class UserDAO extends AbstractDAOImpl {
    private long id;
    private String name;

    public UserDAO(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void save(Object o) {
        super.save(o);
    }

    @Override
    public void saveAll(List T) {
        super.saveAll(T);
    }

    @Override
    public void deleteById(long id) {
        list.remove(this.getId());
    }

    public long getId() {
        return id;
    }
}
