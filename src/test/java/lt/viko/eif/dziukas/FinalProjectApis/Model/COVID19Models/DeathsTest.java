package lt.viko.eif.dziukas.FinalProjectApis.Model.COVID19Models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Deaths
 *
 * @author Dainoras Ziukas, Valdemar Subotkovski, Dominykas Pleteras
 * @version 1.0
 * @since 1.0
 */
class DeathsTest {

    /**
     * Test of getNewDeaths() method, of class Deaths.
     */
    @Test
    void getNewDeaths() {
        Deaths deaths = new Deaths();
        deaths.setNewDeaths("35115");
        String newdeaths= deaths.getNewDeaths();
        assertEquals("35115",newdeaths);
    }

    /**
     * Test of setNewDeaths() method, of class Deaths.
     */
    @Test
    void setNewDeaths() {
        Deaths deaths = new Deaths();
        deaths.setNewDeaths("69420");
        assertEquals("69420",deaths.getNewDeaths());
    }

    /**
     * Test of get_1M_pop() method, of class Deaths.
     */
    @Test
    void get_1M_pop() {
        Deaths deaths = new Deaths();
        deaths.set_1M_pop("6745");
        String pop = deaths.get_1M_pop();
        assertEquals("6745",pop);

    }

    /**
     * Test of set_1M_pop() method, of class Deaths.
     */
    @Test
    void set_1M_pop() {
        Deaths deaths = new Deaths();
        deaths.set_1M_pop("6666");
        assertEquals("6666",deaths.get_1M_pop());
    }

    /**
     * Test of getTotal() method, of class Deaths.
     */
    @Test
    void getTotal() {
        Deaths deaths = new Deaths();
        deaths.setTotal(69945);
        int totalDeaths = deaths.getTotal();
        assertEquals(69945,totalDeaths);
    }

    /**
     * Test of setTotal() method, of class Deaths.
     */
    @Test
    void setTotal() {
        Deaths deaths = new Deaths();
        deaths.setTotal(69945);
        assertEquals(69945,deaths.getTotal());
    }

    /**
     * Test of testToString() method, of class Deaths.
     */
    @Test
    void testToString() {
        Deaths deaths = new Deaths();
        String result = deaths.toString();
        assertTrue(result.contains("total="));
    }
}