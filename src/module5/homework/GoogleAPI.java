package module5.homework;

import java.util.Date;

/**
 * Created by alexandrsemenov on 23.11.16.
 */
public class GoogleAPI extends AbstractAPI {
    Room[] googleRooms;

    public GoogleAPI() {
        googleRooms = new Room[5];
        googleRooms[0] = new Room(15, 1000, 2, new Date(), "Hilton", "Paris");
        googleRooms[1] = new Room(16, 3000, 3, new Date(), "Holiday inn", "Miami");
        googleRooms[2] = new Room(17, 5000, 2, new Date(), "Four Seasons", "Moscow");
        googleRooms[3] = new Room(18, 6100, 1, new Date(), "Bellagio", "LasVegas");
        googleRooms[4] = new Room(19, 9000, 2, new Date(), "Rosa Grand", "Milan");
    }

    @Override
    public Room[] getRooms() {
        return googleRooms;
    }
}
