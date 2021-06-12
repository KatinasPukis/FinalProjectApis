package lt.viko.eif.dziukas.FinalProjectApis.Model;

import lt.viko.eif.dziukas.FinalProjectApis.Model.RESTCountriesModels.Country;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for ZonesModel
 *
 * @author Dainoras Ziukas, Valdemar Subotkovski, Dominykas Pleteras
 * @version 1.0
 * @since 1.0
 */
class ZonesModelTest {

    /**
     * Test of getRedZone method, of class ZonesModel.
     */
    @Test
    void getRedZone() {
        ZonesModel instance = new ZonesModel();
        List<Country> expResult = null;
        List<Country> result = instance.getRedZone();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRedZone method, of class ZonesModel.
     */
    @Test
    void setRedZone() {
        List<Country> redZone = null;
        ZonesModel instance = new ZonesModel();
        instance.setRedZone(redZone);
    }

    /**
     * Test of getYellowZone method, of class ZonesModel.
     */
    @Test
    void getYellowZone() {
        ZonesModel instance = new ZonesModel();
        List<Country> expResult = null;
        List<Country> result = instance.getYellowZone();
        assertEquals(expResult, result);
    }

    /**
     * Test of setYellowZone method, of class ZonesModel.
     */
    @Test
    void setYellowZone() {
        List<Country> yellowZone = null;
        ZonesModel instance = new ZonesModel();
        instance.setYellowZone(yellowZone);
    }

    /**
     * Test of getGreenZone method, of class ZonesModel.
     */
    @Test
    void getGreenZone() {
        ZonesModel instance = new ZonesModel();
        List<Country> expResult = null;
        List<Country> result = instance.getGreenZone();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGreenZone method, of class ZonesModel.
     */
    @Test
    void setGreenZone() {
        List<Country> greenZone = null;
        ZonesModel instance = new ZonesModel();
        instance.setGreenZone(greenZone);
    }

    /**
     * Test of ToString method, of class ZonesModel.
     */
    @Test
    void testToString() {
        ZonesModel instance = new ZonesModel();
        String result = instance.toString();
        assertTrue(result.contains("redZone="));
    }
}