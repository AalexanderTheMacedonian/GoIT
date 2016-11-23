package module5.homework;

/**
 * Created by alexandrsemenov on 22.11.16.
 */
public interface DAO {
    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);
}
