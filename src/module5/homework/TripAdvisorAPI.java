package module5.homework;

import java.util.Date;

/**
 * Created by alexandrsemenov on 23.11.16.
 */
public class TripAdvisorAPI implements API {
    Room[] tripRooms;

    public TripAdvisorAPI() {
        tripRooms = new Room[5];
        tripRooms[0] = new Room(10, 200, 2, new Date(), "Hotel", "City");
        tripRooms[1] = new Room(11, 300, 3, new Date(), "Hotel", "City");
        tripRooms[2] = new Room(12, 500, 2, new Date(), "Hotel", "City");
        tripRooms[3] = new Room(13, 600, 1, new Date(), "Hotel", "City");
        tripRooms[4] = new Room(19, 9000, 2, new Date(),"Hotel", "City");
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int count = 0;
        for (Room r : tripRooms) {
            if (r.getPrice() == price && r.getPersons() == persons && r.getCityName() == city && r.getHotelName()==hotel){
                count++;
            }
        }

        Room[] res = new Room[count];

        int index = 0;
        for (Room r : tripRooms) {
            if (r.getPrice() == price && r.getPersons() == persons && r.getCityName() == city && r.getHotelName()==hotel){
                res[index] = r;
            }
        }
        return res;
    }

    @Override
    public Room[] getRooms() {
        return tripRooms;
    }
}
