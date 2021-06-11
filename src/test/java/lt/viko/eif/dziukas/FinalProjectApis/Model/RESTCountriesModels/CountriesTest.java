package lt.viko.eif.dziukas.FinalProjectApis.Model.RESTCountriesModels;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountriesTest {

    /**
     * Test of getCountries() method, of class Countries.
     */
    @Test
    void getCountries() {
        String countryName = "Latvia";
        assertEquals("Latvia", countryName);
    }

    /**
     *  Test of setCountries method, of class Countries.
     */
    @Test
    void setCountries() {
        String countryName = "Estonia";
        assertEquals("Estonia", countryName);
    }

    /**
     *  Test of getPlayerName method, of class Countries.
     */
    @Test
    void testToString() {
        Player instance = new Player();
        String result = instance.toString();

        assertTrue(result.contains("playerName"));
    }
}