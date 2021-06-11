package lt.viko.eif.dziukas.FinalProjectApis.Model.COVID19Models;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Statistics
 *
 * @author Dainoras Ziukas, Valdemar Subotkovski, Dominykas Pleteras
 * @version 1.0
 * @since 1.0
 */
class StatisticsTest {

    /**
     * Test of getResponse() method, of class Statistics.
     */
    @Test
    void getResponse() {
        Statistics statistics = new Statistics();
        List<Response> responseList = null;
        statistics.setResponse(responseList);
        assertEquals(null,statistics.getResponse());
    }

    /**
     * Test of setResponse() method, of class Statistics.
     */
    @Test
    void setResponse() {
        Statistics statistics = new Statistics();
        List<Response> responseList = null;
        statistics.setResponse(responseList);
        assertEquals(null,statistics.getResponse());

    }

    /**
     * Test of getContinent() method, of class Statistics.
     */
    @Test
    void testToString() {
        Statistics statistics = new Statistics();
        String result = statistics.toString();
        assertTrue(result.contains("response="));
    }
}