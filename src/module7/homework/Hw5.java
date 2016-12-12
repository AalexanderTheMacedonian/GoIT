package module7.homework;

import module5.homework.Room;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by alexandrsemenov on 12.12.16.
 */
public class Hw5 {
    public static void main(String[] args) {
        List<Room> bookingRooms = new ArrayList<>();
        List<Room> googleRooms = new ArrayList<>();
        List<Room> tripRooms = new ArrayList<>();

        bookingRooms.add(new Room(10, 200, 2, new Date(), "Hilton", "Kiev"));
        bookingRooms.add(new Room(11, 300, 3, new Date(), "Marcus Marriott", "New York"));
        bookingRooms.add(new Room(12, 500, 2, new Date(), "Caesars Palace", "LasVegas"));
        bookingRooms.add(new Room(13, 600, 1, new Date(), "Hotel Vienna", "Vienna"));
        bookingRooms.add(new Room(19, 9000, 2, new Date(), "Rosa Grand", "Milan"));

        googleRooms.add(new Room(15, 1000, 2, new Date(), "Hilton", "Paris"));
        googleRooms.add(new Room(16, 3000, 3, new Date(), "Holiday inn", "Miami"));
        googleRooms.add(new Room(17, 5000, 2, new Date(), "Four Seasons", "Moscow"));
        googleRooms.add(new Room(18, 6100, 1, new Date(), "Bellagio", "LasVegas"));
        googleRooms.add(new Room(19, 9000, 2, new Date(), "Rosa Grand", "Milan"));

        tripRooms.add(new Room(10, 200, 2, new Date(), "Hotel", "City"));
        tripRooms.add(new Room(11, 300, 3, new Date(), "Hotel", "City"));
        tripRooms.add(new Room(12, 500, 2, new Date(), "Hotel", "City"));
        tripRooms.add(new Room(13, 600, 1, new Date(), "Hotel", "City"));
        tripRooms.add(new Room(19, 9000, 2, new Date(),"Hotel", "City"));
    }
}
