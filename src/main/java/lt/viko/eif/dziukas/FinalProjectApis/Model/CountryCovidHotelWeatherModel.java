package lt.viko.eif.dziukas.FinalProjectApis.Model;

import lt.viko.eif.dziukas.FinalProjectApis.Model.BestCapitalHotelModel.Hotel;
import lt.viko.eif.dziukas.FinalProjectApis.Model.COVID19Models.Statistics;
import lt.viko.eif.dziukas.FinalProjectApis.Model.RESTCountriesModels.Country;
import lt.viko.eif.dziukas.FinalProjectApis.Model.WeatherModel.Weather;

/**
 * Represents CountryCodHotelWeatherModel object which is
 * the main and most important model of this project. It
 * includes country information, best hotel information, covid statistics
 * of the country and weather information in countries capital.
 *
 * @author Dainoras Ziukas, Valdemar Subotkovski, Dominykas Pleteras
 * @version 1.0
 * @since 1.0
 */
public class CountryCovidHotelWeatherModel {

    private Country country;
    private Hotel bestHotelInCountriesCapital; // MOKAMAS Api, 10max XDD
    private Statistics covidStatistics;
    private Weather weather;

    /**
     * Gets country.
     *
     * @return country.
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Sets country.
     *
     * @param country .
     */
    public void setCountry(Country country) {
        this.country = country;
    }

    /**
     * Gets hotel.
     *
     * @return hotel.
     */
    public Hotel getBestHotelInCountriesCapital() {
        return bestHotelInCountriesCapital;
    }

    /**
     * Sets hotel.
     *
     * @param bestHotelInCountriesCapital .
     */
    public void setBestHotelInCountriesCapital(Hotel bestHotelInCountriesCapital) {
        this.bestHotelInCountriesCapital = bestHotelInCountriesCapital;
    }

    /**
     * Gets covid statistics.
     *
     * @return covid statistics.
     */
    public Statistics getCovidStatistics() {
        return covidStatistics;
    }

    /**
     * Sets covid statistics.
     *
     * @param covidStatistics .
     */
    public void setCovidStatistics(Statistics covidStatistics) {
        this.covidStatistics = covidStatistics;
    }

    /**
     * Gets weather.
     *
     * @return weather.
     */
    public Weather getWeather() {
        return weather;
    }

    /**
     * Sets weather.
     *
     * @param weather .
     */
    public void setWeather(Weather weather) {
        this.weather = weather;
    }
}
