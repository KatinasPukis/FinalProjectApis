package lt.viko.eif.dziukas.FinalProjectApis.Model.COVID19Models;

import lt.viko.eif.dziukas.FinalProjectApis.Model.BestCapitalHotelModel.Hotel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Cases
 *
 * @author Dainoras Ziukas, Valdemar Subotkovski, Dominykas Pleteras
 * @version 1.0
 * @since 1.0
 */
class CasesTest {

    /**
     * Test of getNewCases() method, of class Hotel.
     */
    @Test
    void getNewCases() {
        Cases cases = new Cases();
        cases.setNewCases("350");
        String newCases = cases.getNewCases();
        assertEquals("350", newCases);
    }

    /**
     * Test of setNewCases() method, of class Hotel.
     */
    @Test
    void setNewCases() {
        Cases cases = new Cases();
        cases.setNewCases("654");
        assertEquals("654",cases.getNewCases());
    }

    /**
     * Test of getActive() method, of class Hotel.
     */
    @Test
    void getActive() {
        Cases cases = new Cases();
        cases.setActive(1354);
        int activeCases = cases.getActive();
        assertEquals(1354, activeCases);

    }

    /**
     * Test of setActive() method, of class Hotel.
     */
    @Test
    void setActive() {
        Cases cases = new Cases();
        cases.setActive(1354);
        assertEquals(1354, cases.getActive());
    }

    /**
     * Test of getCritical() method, of class Hotel.
     */
    @Test
    void getCritical() {
        Cases cases = new Cases();
        cases.setCritical(6548);
        int critical = cases.getCritical();
        assertEquals(6548,critical);
    }

    /**
     * Test of setCritical() method, of class Hotel.
     */
    @Test
    void setCritical() {
        Cases cases = new Cases();
        cases.setCritical(3654);
        assertEquals(3654,cases.getCritical());
    }

    /**
     * Test of getRecovered() method, of class Hotel.
     */
    @Test
    void getRecovered() {
        Cases cases = new Cases();
        cases.setRecovered(1554);
        int recovered = cases.getRecovered();
        assertEquals(1554,recovered);
    }

    /**
     * Test of setRecovered() method, of class Hotel.
     */
    @Test
    void setRecovered() {
        Cases cases = new Cases();
        cases.setRecovered(2000);
        assertEquals(2000,cases.getRecovered());
    }

    /**
     * Test of get_1M_pop() method, of class Hotel.
     */
    @Test
    void get_1M_pop() {
        Cases cases = new Cases();
        cases.set_1M_pop("1486");
        String pop = cases.get_1M_pop();
        assertEquals("1486",pop);
    }

    /**
     * Test of set_1M_pop() method, of class Hotel.
     */
    @Test
    void set_1M_pop() {
        Cases cases = new Cases();
        cases.set_1M_pop("1486");
        assertEquals("1486",cases.get_1M_pop());
    }

    /**
     * Test of getTotal() method, of class Hotel.
     */
    @Test
    void getTotal() {
        Cases cases = new Cases();
        cases.setTotal(154896);
        int total = cases.getTotal();
        assertEquals(154896,total);
    }

    /**
     * Test of setTotal() method, of class Hotel.
     */
    @Test
    void setTotal() {
        Cases cases = new Cases();
        cases.setTotal(265415);
        assertEquals(265415,cases.getTotal());
    }

    /**
     * Test of testToString() method, of class Hotel.
     */
    @Test
    void testToString() {
        Cases cases = new Cases();
        String result = cases.toString();
        assertTrue(result.contains("total="));
    }
}