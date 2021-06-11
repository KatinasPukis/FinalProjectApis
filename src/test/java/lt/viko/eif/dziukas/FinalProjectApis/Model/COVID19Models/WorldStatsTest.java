package lt.viko.eif.dziukas.FinalProjectApis.Model.COVID19Models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for WorldStats
 *
 * @author Dainoras Ziukas, Valdemar Subotkovski, Dominykas Pleteras
 * @version 1.0
 * @since 1.0
 */
class WorldStatsTest {

    /**
     * Test of getActiveCases() method, of class WorldStats.
     */
    @Test
    void getActiveCases() {
        WorldStats worldStats = new WorldStats();
        worldStats.setActiveCases("651561");
        String activeCase = worldStats.getActiveCases();
        assertEquals("651561",activeCase);

    }

    /**
     * Test of setActiveCases() method, of class WorldStats.
     */
    @Test
    void setActiveCases() {
        WorldStats worldStats = new WorldStats();
        worldStats.setActiveCases("175,658,157");
        assertEquals("175,658,157",worldStats.getActiveCases());
    }

    /**
     * Test of getName() method, of class WorldStats.
     */
    @Test
    void getName() {
        WorldStats worldStats = new WorldStats();
        worldStats.setName("Spain");
        String name = "Spain";
        assertEquals("Spain",name);
    }

    /**
     * Test of setName() method, of class WorldStats.
     */
    @Test
    void setName() {
        WorldStats worldStats = new WorldStats();
        worldStats.setName("SPain");
        assertEquals("SPain",worldStats.getName());
    }

    /**
     * Test of getLastUpdate() method, of class WorldStats.
     */
    @Test
    void getLastUpdate() {
        WorldStats worldStats = new WorldStats();
        worldStats.setLastUpdate("2021-06-11 09:45");
        String lastUpdate = worldStats.getLastUpdate();
        assertEquals("2021-06-11 09:45",lastUpdate);
    }

    /**
     * Test of setLastUpdate() method, of class WorldStats.
     */
    @Test
    void setLastUpdate() {
        WorldStats worldStats = new WorldStats();
        worldStats.setLastUpdate("2021-06-11 09:45");
        assertEquals("2021-06-11 09:45",worldStats.getLastUpdate());
    }

    /**
     * Test of getNewCases() method, of class WorldStats.
     */
    @Test
    void getNewCases() {
        WorldStats worldStats = new WorldStats();
        worldStats.setNewCases("+53,001");
        String newCases = worldStats.getNewCases();
        assertEquals("+53,001",worldStats.getNewCases());
    }

    /**
     * Test of setNewCases() method, of class WorldStats.
     */
    @Test
    void setNewCases() {
        WorldStats worldStats = new WorldStats();
        worldStats.setNewCases("+53,001");
        assertEquals("+53,001",worldStats.getNewCases());
    }

    /**
     * Test of getNewDeaths() method, of class WorldStats.
     */
    @Test
    void getNewDeaths() {
        WorldStats worldStats = new WorldStats();
        worldStats.setNewDeaths("+1,532");
        String newDeaths = worldStats.getNewDeaths();
        assertEquals("+1,532",newDeaths);
    }

    /**
     * Test of setNewDeaths() method, of class WorldStats.
     */
    @Test
    void setNewDeaths() {
        WorldStats worldStats = new WorldStats();
        worldStats.setNewDeaths("1,532");
        assertEquals("1,532",worldStats.getNewDeaths());
    }

    /**
     * Test of getTotalCases() method, of class WorldStats.
     */
    @Test
    void getTotalCases() {
        WorldStats worldStats = new WorldStats();
        worldStats.setTotalCases("175,658,157");
        String totalCases = worldStats.getTotalCases();
        assertEquals("175,658,157",totalCases);

    }

    /**
     * Test of setTotalCases() method, of class WorldStats.
     */
    @Test
    void setTotalCases() {
        WorldStats worldStats = new WorldStats();
        worldStats.setTotalCases("175,658,157");
        assertEquals("175,658,157",worldStats.getTotalCases());
    }

    /**
     * Test of getTotalRecovered_text() method, of class WorldStats.
     */
    @Test
    void getTotalRecovered_text() {
        WorldStats worldStats = new WorldStats();
        worldStats.setTotalRecovered_text("159,519,962");
        String recovered = worldStats.getTotalRecovered_text();
        assertEquals("159,519,962",recovered);
    }

    /**
     * Test of setTotalRecovered_text() method, of class WorldStats.
     */
    @Test
    void setTotalRecovered_text() {
        WorldStats worldStats = new WorldStats();
        worldStats.setTotalRecovered_text("159,519,962");
        assertEquals("159,519,962",worldStats.getTotalRecovered_text());
    }

    /**
     * Test of getTotalDeaths() method, of class WorldStats.
     */
    @Test
    void getTotalDeaths() {
        WorldStats worldStats = new WorldStats();
        worldStats.setTotalDeaths("3,789,940");
        String deaths = worldStats.getTotalDeaths();
        assertEquals("3,789,940",deaths);
    }

    /**
     * Test of setTotalDeaths() method, of class WorldStats.
     */
    @Test
    void setTotalDeaths() {
        WorldStats worldStats = new WorldStats();
        worldStats.setTotalDeaths("3,789,940");
        assertEquals("3,789,940",worldStats.getTotalDeaths());
    }
    @Test
    void testToString() {
        WorldStats worldStats = new WorldStats();
        String result = worldStats.toString();
        assertTrue(result.contains(""));


    }
}