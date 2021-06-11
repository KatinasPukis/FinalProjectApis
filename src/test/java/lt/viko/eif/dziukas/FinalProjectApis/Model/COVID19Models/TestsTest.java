package lt.viko.eif.dziukas.FinalProjectApis.Model.COVID19Models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Tests
 *
 * @author Dainoras Ziukas, Valdemar Subotkovski, Dominykas Pleteras
 * @version 1.0
 * @since 1.0
 */
class TestsTest {

    /**
     * Test of get_1M_pop() method, of class Tests.
     */
    @Test
    void get_1M_pop() {
        Tests tests = new Tests();
        tests.set_1M_pop("664865");
        String pop = tests.get_1M_pop();
        assertEquals("664865",tests.get_1M_pop());
    }

    /**
     * Test of set_1M_pop() method, of class Tests.
     */
    @Test
    void set_1M_pop() {
        Tests tests = new Tests();
        tests.set_1M_pop("664865");
        assertEquals("664865",tests.get_1M_pop());

    }

    /**
     * Test of getTotal() method, of class Tests.
     */
    @Test
    void getTotal() {
        Tests tests = new Tests();
        tests.setTotal(78645);
        int total = tests.getTotal();
        assertEquals(78645,tests.getTotal());

    }


    /**
     * Test of setTotal() method, of class Tests.
     */
    @Test
    void setTotal() {
        Tests tests = new Tests();
        tests.setTotal(78645);
        assertEquals(78645,tests.getTotal());

    }

    /**
     * Test of testToString() method, of class Tests.
     */
    @Test
    void testToString() {
        Tests tests = new Tests();
        String result = tests.toString();
        assertTrue(result.contains("total="));


    }
}