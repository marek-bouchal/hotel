import com.engeto.hotel.Booking;
import com.engeto.hotel.Guest;
import com.engeto.hotel.Room;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Guest guest1 = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        Guest guest2 = new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));

        ArrayList<Guest> listOfGuests = new ArrayList();

        listOfGuests.add(guest1);
        listOfGuests.add(guest2);

        for (Guest guest : listOfGuests) {
            System.out.println("Jméno: " + guest.getFirstName() + " " + guest.getSurname());
            System.out.println("Datum narození: " + guest.getDateOfBirth().toString());
            System.out.println();
        }

        Room room1 = new Room(1,1, true,true, BigDecimal.valueOf(1000));
        Room room2 = new Room(2,1, true,true, BigDecimal.valueOf(1000));
        Room room3 = new Room(3,3, false,true, BigDecimal.valueOf(2400));

        ArrayList<Room> listOfRooms = new ArrayList();
        listOfRooms.add(room1);
        listOfRooms.add(room2);
        listOfRooms.add(room3);

        for (Room room : listOfRooms) {
            System.out.println("Číslo pokoje: " + room.getRoomNumber());
            System.out.println("Počet lůžek: " + room.getNumberOfBeds());
            System.out.println("Balkon: " + room.isHasBalcony());
            System.out.println("Výhled na moře: " + room.isHasSeaView());
            System.out.println("Cena za pokoj: " + room.getPricePerNight());
            System.out.println();
        }

        Booking booking1 = new Booking(room1,guest1,LocalDate.of(2021,01,19),LocalDate.of(2021,07,26));

        ArrayList<Booking> listOfBookings = new ArrayList();
        listOfBookings.add(booking1);
//        listOfBookings.add(booking2);
    }
}
