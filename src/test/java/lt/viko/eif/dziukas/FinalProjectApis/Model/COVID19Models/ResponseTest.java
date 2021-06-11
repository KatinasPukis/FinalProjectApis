package lt.viko.eif.dziukas.FinalProjectApis.Model.COVID19Models;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Response
 *
 * @author Dainoras Ziukas, Valdemar Subotkovski, Dominykas Pleteras
 * @version 1.0
 * @since 1.0
 */
class ResponseTest {

    /**
     * Test of getContinent() method, of class Response.
     */
    @Test
    void getContinent() {
        Response response = new Response();
        response.setContinent("Africa");
        String continent = response.getContinent();
        assertEquals("Africa",continent);
    }

    /**
     * Test of setContinent() method, of class Response.
     */
    @Test
    void setContinent() {
        Response response = new Response();
        response.setContinent("Europe");
        assertEquals("Europe",response.getContinent());

    }

    /**
     * Test of getCountry() method, of class Response.
     */
    @Test
    void getCountry() {
        Response response = new Response();
        response.setCountry("Lithuania");
        String country = response.getCountry();
        assertEquals("Lithuania", country);
    }

    /**
     * Test of setCountry() method, of class Response.
     */
    @Test
    void setCountry() {
        Response response = new Response();
        response.setCountry("Russia");
        assertEquals("Russia",response.getCountry());
    }

    /**
     * Test of getPopulation() method, of class Response.
     */
    @Test
    void getPopulation() {
        Response response = new Response();
        response.setPopulation(356000);
        int population = response.getPopulation();
        assertEquals(356000,population);
    }

    /**
     * Test of setPopulation() method, of class Response.
     */
    @Test
    void setPopulation() {
        Response response = new Response();
        response.setPopulation(356000);
        assertEquals(356000,response.getPopulation());
    }

    /**
     * Test of getCases() method, of class Response.
     */
    @Test
    void getCases() {
        Response response = new Response();
        Cases cases = new Cases();
        cases.setTotal(356000);
        cases.setNewCases("55584");
        cases.set_1M_pop("584884");
        cases.setCritical(51856);
        cases.setActive(4856);
        cases.setRecovered(615185);
        response.setCases(cases);
        Cases tempCase = response.getCases();
        assertEquals(tempCase,response.getCases());
    }

    /**
     * Test of setCases() method, of class Response.
     */
    @Test
    void setCases() {
        Response response = new Response();
        Cases cases = new Cases();
        cases.setTotal(356000);
        cases.setNewCases("55584");
        cases.set_1M_pop("584884");
        cases.setCritical(51856);
        cases.setActive(4856);
        cases.setRecovered(615185);
        response.setCases(cases);
        Cases tempCase = response.getCases();
        assertEquals(tempCase,response.getCases());
    }

    /**
     * Test of getDeaths() method, of class Response.
     */
    @Test
    void getDeaths() {
        Response response = new Response();
        Deaths deaths = new Deaths();
        deaths.setNewDeaths("514515");
        deaths.setTotal(16645);
        deaths.set_1M_pop("516516");
        response.setDeaths(deaths);
        Deaths tempDeaths = response.getDeaths();
        assertEquals(tempDeaths,response.getDeaths());

    }

    /**
     * Test of setDeaths() method, of class Response.
     */
    @Test
    void setDeaths() {
        Response response = new Response();
        Deaths deaths = new Deaths();
        deaths.setNewDeaths("514515");
        deaths.setTotal(16645);
        deaths.set_1M_pop("516516");
        response.setDeaths(deaths);
        Deaths tempDeaths = response.getDeaths();
        assertEquals(tempDeaths,response.getDeaths());
    }

    /**
     * Test of getTests() method, of class Response.
     */
    @Test
    void getTests() {
        Response response = new Response();
        Tests tests = new Tests();
        tests.setTotal(100000);
        tests.set_1M_pop("54869");
        response.setTests(tests);
        Tests tempTest= response.getTests();
        assertEquals(tempTest,response.getTests());
    }

    /**
     * Test of setTests() method, of class Response.
     */
    @Test
    void setTests() {
        Response response = new Response();
        Tests tests = new Tests();
        tests.setTotal(100000);
        tests.set_1M_pop("54869");
        response.setTests(tests);
        Tests tempTest= response.getTests();
        assertEquals(tempTest,response.getTests());
    }

    /**
     * Test of getDay() method, of class Response.
     */
    @Test
    void getDay() {
        Response response = new Response();
        response.setDay("2021-06-11");
        String date = response.getDay();
        assertEquals("2021-06-11",response.getDay());
    }

    /**
     * Test of setDay() method, of class Response.
     */
    @Test
    void setDay() {
        Response response = new Response();
        response.setDay("2021-06-11");
        assertEquals("2021-06-11",response.getDay());
    }

    /**
     * Test of getTime() method, of class Response.
     */
    @Test
    void getTime() {
        //date parsinmas scuffed
    }

    /**
     * Test of setTime() method, of class Response.
     */
    @Test
    void setTime() {
        Response response = new Response();
        //dadeds
    }

    /**
     * Test of testToString() method, of class Response.
     */
    @Test
    void testToString() {
        Response response = new Response();
        String rsult = response.toString();
        assertTrue(rsult.contains("day="));
    }
}