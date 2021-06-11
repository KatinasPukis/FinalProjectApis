package lt.viko.eif.dziukas.FinalProjectApis.Model.UserModels;

import lt.viko.eif.dziukas.FinalProjectApis.Model.CountryCovidHotelWeatherModel;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for VisitedCountries
 *
 * @author Dainoras Ziukas, Valdemar Subotkovski, Dominykas Pleteras
 * @version 1.0
 * @since 1.0
 */
class VisitedCountriesTest {

    /**
     * Test of getCountries method, of class Country.
     */
    @Test
    void getCountries() {
        List<CountryCovidHotelWeatherModel> instance2 = null;
        ToVisitCountries instance = new ToVisitCountries(instance2);
        List<CountryCovidHotelWeatherModel> result = instance.getCountries();
        assertEquals(null, result);
    }

    /**
     * Test of setCountries method, of class Country.
     */
    @Test
    void setCountries() {
        CountryCovidHotelWeatherModel instance2 = null;
        ToVisitCountry instance = new ToVisitCountry(instance2);
        instance.setCountry(instance2);
        assertEquals(null, instance2);
    }
}