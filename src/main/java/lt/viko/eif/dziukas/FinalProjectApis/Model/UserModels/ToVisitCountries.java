package lt.viko.eif.dziukas.FinalProjectApis.Model.UserModels;

import lt.viko.eif.dziukas.FinalProjectApis.Model.CountryCovidHotelWeatherModel;

import java.util.List;

/**
 * Represents ToVisitCountry list that is stored in repository
 * and has a list of countries.
 *
 * @author Dainoras Ziukas, Valdemar Subotkovski, Dominykas Pleteras
 * @version 1.0
 * @since 1.0
 */

public class ToVisitCountries {

    private List<CountryCovidHotelWeatherModel> countries;

    /**
     * Constructor of the ToVisitCountries.
     *
     * @param countries of the list.
     */
    public ToVisitCountries(List<CountryCovidHotelWeatherModel> countries) {
        this.countries = countries;
    }

    /**
     * Gets countries list.
     *
     * @return countries lsit.
     */
    public List<CountryCovidHotelWeatherModel> getCountries() {
        return countries;
    }

    /**
     * Sets countries list.
     *
     * @param countries list.
     */
    public void setCountries(List<CountryCovidHotelWeatherModel> countries) {
        this.countries = countries;
    }
}
