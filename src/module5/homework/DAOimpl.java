package module5.homework;

import java.util.Date;

/**
 * Created by alexandrsemenov on 22.11.16.
 */
public class DAOimpl implements DAO {

    @Override
    public Room save(Room room) {
        System.out.println("Room "+room.getId()+" is saved");
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println("Room " +room+" is deleted");
        return true;
    }

    @Override
    public Room update(Room room) {
        System.out.println("Room "+room+" is updated");
        return room;
    }

    @Override
    public Room findById(long id) {
        Room room = new Room(20, 300, 2,new Date(),"hotel", "city");
        System.out.println("Searching room by id number :"+id);
        return room;
    }
}
