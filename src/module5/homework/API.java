package module5.homework;

/**
 * Created by alexandrsemenov on 22.11.16.
 */
public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);
    Room[] getRooms();
}
