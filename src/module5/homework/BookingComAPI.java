package module5.homework;

import java.util.Date;

/**
 * Created by alexandrsemenov on 22.11.16.
 */
public class BookingComAPI implements API {
    Room[] bookingRooms;

    public BookingComAPI() {
        bookingRooms = new Room[5];
        bookingRooms[0] = new Room(10, 200, 2, new Date(), "Hilton", "Kiev");
        bookingRooms[1] = new Room(11, 300, 3, new Date(), "Marcus Marriott", "New York");
        bookingRooms[2] = new Room(12, 500, 2, new Date(), "Caesars Palace", "LasVegas");
        bookingRooms[3] = new Room(13, 600, 1, new Date(), "Hotel Vienna", "Vienna");
        bookingRooms[4] = new Room(19, 9000, 2, new Date(), "Rosa Grand", "Milan");
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int count = 0;
        for (Room r : bookingRooms) {
            if (r.getPrice() == price && r.getPersons() == persons && r.getCityName() == city && r.getHotelName()==hotel){
                count++;
            }
        }

        Room[] res = new Room[count];

        int index = 0;
        for (Room r : bookingRooms) {
            if (r.getPrice() == price && r.getPersons() == persons && r.getCityName() == city && r.getHotelName()==hotel){
                res[index] = r;
            }
        }
        return res;
    }

    @Override
    public Room[] getRooms() {
        return bookingRooms;
    }

}

