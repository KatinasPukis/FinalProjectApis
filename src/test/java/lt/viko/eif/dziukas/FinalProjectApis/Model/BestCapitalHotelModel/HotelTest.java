package lt.viko.eif.dziukas.FinalProjectApis.Model.BestCapitalHotelModel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Hotel
 *
 * @author Dainoras Ziukas, Valdemar Subotkovski, Dominykas Pleteras
 * @version 1.0
 * @since 1.0
 */
class HotelTest {

    /**
     * Test of getName() method, of class Hotel.
     */
    @Test
    void getName() {
        Hotel hotel = new Hotel();
        hotel.setName("Birstonas");
        String hotelname = hotel.getName();
        assertEquals("Birstonas", hotelname);
    }

    /**
     * Test of setName() method, of class Hotel.
     */
    @Test
    void setName() {
        Hotel hotel = new Hotel();
        hotel.setName("Birstonas");
        assertEquals("Birstonas", hotel.getName());

    }

    /**
     * Test of getLink() method, of class Hotel.
     */
    @Test
    void getLink() {
        Hotel hotel = new Hotel();
        hotel.setLink("https://www.booking.com/hotel/lt/hotellietuva-vilnius.de.html?aid=1938431");
        String hotellink = hotel.getLink();
        assertEquals("https://www.booking.com/hotel/lt/hotellietuva-vilnius.de.html?aid=1938431", hotel.getLink());


    }

    /**
     * Test of setLink() method, of class Hotel.
     */
    @Test
    void setLink() {
        Hotel hotel = new Hotel();
        hotel.setLink("https://www.booking.com/hotel/lt/hotellietuva-vilnius.de.html?aid=1938431");
        assertEquals("https://www.booking.com/hotel/lt/hotellietuva-vilnius.de.html?aid=1938431", hotel.getLink());

    }

    /**
     * Test of getRating() method, of class Hotel.
     */
    @Test
    void getRating() {
        Hotel hotel = new Hotel();
        hotel.setRating("9.5");
        String hotelrating = hotel.getRating();
        assertEquals("9.5", hotelrating);
    }

    /**
     * Test of setRating() method, of class Hotel.
     */
    @Test
    void setRating() {
        Hotel hotel = new Hotel();
        hotel.setRating("8.5");
        assertEquals("8.5", hotel.getRating());
    }

    /**
     * Test of getPrice() method, of class Hotel.
     */
    @Test
    void getPrice() {
        Hotel hotel = new Hotel();
        hotel.setPrice("320");
        String hotelprice = hotel.getPrice();
        assertEquals("320", hotelprice);
    }

    /**
     * Test of setPrice() method, of class Hotel.
     */
    @Test
    void setPrice() {
        Hotel hotel = new Hotel();
        hotel.setPrice("200");
        assertEquals("200", hotel.getPrice());
    }

    /**
     * Test of testToString() method, of class Hotel.
     */
    @Test
    void testToString() {
        Hotel hotel = new Hotel();
        String result = hotel.toString();

        assertTrue(result.contains("price="));
    }
}