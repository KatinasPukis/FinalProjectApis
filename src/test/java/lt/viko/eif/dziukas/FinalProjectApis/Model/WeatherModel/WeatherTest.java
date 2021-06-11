package lt.viko.eif.dziukas.FinalProjectApis.Model.WeatherModel;

import lt.viko.eif.dziukas.FinalProjectApis.Model.RESTCountriesModels.Country;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Weather
 *
 * @author Dainoras Ziukas, Valdemar Subotkovski, Dominykas Pleteras
 * @version 1.0
 * @since 1.0
 */
class WeatherTest {

    /**
     * Test of getTemp method, of class Weather.
     */
    @Test
    void getTemp() {
        Weather instance = new Weather();
        instance.setTemp(23.4);
        Double result = instance.getTemp();
        assertEquals(23.4, result);
    }

    /**
     * Test of setTemp method, of class Weather.
     */
    @Test
    void setTemp() {
        Weather instance = new Weather();
        instance.setTemp(31.5);
        assertEquals(31.5, instance.getTemp());
    }

    /**
     * Test of getTempMin method, of class Weather.
     */
    @Test
    void getTempMin() {
        Weather instance = new Weather();
        instance.setTempMin(26.1);
        Double result = instance.getTempMin();
        assertEquals(26.1, result);
    }

    /**
     * Test of setTempMin method, of class Weather.
     */
    @Test
    void setTempMin() {
        Weather instance = new Weather();
        instance.setTempMin(22.2);
        assertEquals(22.2, instance.getTempMin());
    }

    /**
     * Test of getHumidity method, of class Weather.
     */
    @Test
    void getHumidity() {
        Weather instance = new Weather();
        instance.setHumidity(45.0);
        Double result = instance.getHumidity();
        assertEquals(45.0, result);
    }

    /**
     * Test of setHumidity method, of class Weather.
     */
    @Test
    void setHumidity() {
        Weather instance = new Weather();
        instance.setHumidity(55.3);
        assertEquals(55.3, instance.getHumidity());
    }

    /**
     * Test of getPressure method, of class Weather.
     */
    @Test
    void getPressure() {
        Weather instance = new Weather();
        instance.setPressure(1013.2);
        Double result = instance.getPressure();
        assertEquals(1013.2, result);
    }

    /**
     * Test of setPressure method, of class Weather.
     */
    @Test
    void setPressure() {
        Weather instance = new Weather();
        instance.setHumidity(1253.4);
        assertEquals(1253.4, instance.getHumidity());
    }

    /**
     * Test of getFeelsLike method, of class Weather.
     */
    @Test
    void getFeelsLike() {
        Weather instance = new Weather();
        instance.setFeelsLike(23.84);
        Double result = instance.getFeelsLike();
        assertEquals(23.84, result);
    }

    /**
     * Test of setFeelsLike method, of class Weather.
     */
    @Test
    void setFeelsLike() {
        Weather instance = new Weather();
        instance.setFeelsLike(24.4);
        assertEquals(24.4, instance.getFeelsLike());
    }

    /**
     * Test of getTempMax method, of class Weather.
     */
    @Test
    void getTempMax() {
        Weather instance = new Weather();
        instance.setTempMax(21.1);
        Double result = instance.getTempMax();
        assertEquals(21.1, result);
    }

    /**
     * Test of setTempMax method, of class Weather.
     */
    @Test
    void setTempMax() {
        Weather instance = new Weather();
        instance.setTempMax(35.3);
        assertEquals(35.3, instance.getTempMax());
    }

    /**
     * Test of ToString method, of class Weather.
     */
    @Test
    void testToString() {
        Weather instance = new Weather();
        String result = instance.toString();
        assertTrue(result.contains("humidity="));
    }
}