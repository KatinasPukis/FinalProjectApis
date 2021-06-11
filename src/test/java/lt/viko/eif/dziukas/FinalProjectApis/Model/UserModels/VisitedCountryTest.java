package lt.viko.eif.dziukas.FinalProjectApis.Model.UserModels;

import lt.viko.eif.dziukas.FinalProjectApis.Model.CountryCovidHotelWeatherModel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for VisitedCountry
 *
 * @author Dainoras Ziukas, Valdemar Subotkovski, Dominykas Pleteras
 * @version 1.0
 * @since 1.0
 */
class VisitedCountryTest {

    /**
     * Test of getCountry method, of class Country.
     */
    @Test
    void getCountry() {
        CountryCovidHotelWeatherModel instance2 = null;
        ToVisitCountry instance = new ToVisitCountry(instance2);
        CountryCovidHotelWeatherModel result = instance.getCountry();
        assertEquals(null, result);
    }

    /**
     * Test of setCountry method, of class Country.
     */
    @Test
    void setCountry() {
        CountryCovidHotelWeatherModel instance2 = null;
        ToVisitCountry instance = new ToVisitCountry(instance2);
        instance.setCountry(instance2);
        assertEquals(null, instance2);
    }
}