package lt.viko.eif.dziukas.FinalProjectApis.Model;

import lt.viko.eif.dziukas.FinalProjectApis.APIs.BestCapitalHotel;
import lt.viko.eif.dziukas.FinalProjectApis.Model.BestCapitalHotelModel.Hotel;
import lt.viko.eif.dziukas.FinalProjectApis.Model.COVID19Models.Statistics;
import lt.viko.eif.dziukas.FinalProjectApis.Model.RESTCountriesModels.Country;
import lt.viko.eif.dziukas.FinalProjectApis.Model.WeatherModel.Weather;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for CountryCovidHotelWeatherModel
 *
 * @author Dainoras Ziukas, Valdemar Subotkovski, Dominykas Pleteras
 * @version 1.0
 * @since 1.0
 */
class CountryCovidHotelWeatherModelTest {

    /**
     * Test of getCountry method, of class CountryCovidHotelWeatherModel.
     */
    @Test
    void getCountry() {
        CountryCovidHotelWeatherModel instance = new CountryCovidHotelWeatherModel();
        instance.setCountry(null);
        Country result = instance.getCountry();
        assertEquals(null, result);
    }

    /**
     * Test of setCountry method, of class CountryCovidHotelWeatherModel.
     */
    @Test
    void setCountry() {
        CountryCovidHotelWeatherModel instance = new CountryCovidHotelWeatherModel();
        instance.setCountry(null);
        assertEquals(null, instance.getCountry());
    }

    /**
     * Test of getBestHotelInCountriesCapital method, of class CountryCovidHotelWeatherModel.
     */
    @Test
    void getBestHotelInCountriesCapital() {
        CountryCovidHotelWeatherModel instance = new CountryCovidHotelWeatherModel();
        instance.setBestHotelInCountriesCapital(null);
        Hotel result = instance.getBestHotelInCountriesCapital();
        assertEquals(null, result);
    }

    /**
     * Test of setBestHotelInCountriesCapital method, of class CountryCovidHotelWeatherModel.
     */
    @Test
    void setBestHotelInCountriesCapital() {
        CountryCovidHotelWeatherModel instance = new CountryCovidHotelWeatherModel();
        instance.setBestHotelInCountriesCapital(null);
        assertEquals(null, instance.getBestHotelInCountriesCapital());
    }

    /**
     * Test of getCovidStatistics method, of class CountryCovidHotelWeatherModel.
     */
    @Test
    void getCovidStatistics() {
        CountryCovidHotelWeatherModel instance = new CountryCovidHotelWeatherModel();
        instance.setCovidStatistics(null);
        Statistics result = instance.getCovidStatistics();
        assertEquals(null, result);
    }

    /**
     * Test of setCovidStatistics method, of class CountryCovidHotelWeatherModel.
     */
    @Test
    void setCovidStatistics() {
        CountryCovidHotelWeatherModel instance = new CountryCovidHotelWeatherModel();
        instance.setCovidStatistics(null);
        assertEquals(null, instance.getCovidStatistics());
    }

    /**
     * Test of getWeather method, of class CountryCovidHotelWeatherModel.
     */
    @Test
    void getWeather() {
        CountryCovidHotelWeatherModel instance = new CountryCovidHotelWeatherModel();
        instance.setWeather(null);
        Weather result = instance.getWeather();
        assertEquals(null, result);
    }

    /**
     * Test of setWeather method, of class CountryCovidHotelWeatherModel.
     */
    @Test
    void setWeather() {
        CountryCovidHotelWeatherModel instance = new CountryCovidHotelWeatherModel();
        instance.setWeather(null);
        assertEquals(null, instance.getWeather());
    }
}