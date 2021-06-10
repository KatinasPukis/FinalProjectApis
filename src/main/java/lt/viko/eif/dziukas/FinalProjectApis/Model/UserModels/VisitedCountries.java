package lt.viko.eif.dziukas.FinalProjectApis.Model.UserModels;

import lt.viko.eif.dziukas.FinalProjectApis.Model.CountryCovidHotelWeatherModel;

import java.util.List;

/**
 * Represents VisitedCountries list that is stored in repository
 * and has a list of countries.
 *
 * @author Dainoras Ziukas, Valdemar Subotkovski, Dominykas Pleteras
 * @version 1.0
 * @since 1.0
 */
public class VisitedCountries {


    private List<CountryCovidHotelWeatherModel> countries;

    /**
     * Constructor of the VisitedCountries.
     *
     * @param countries of the list.
     */
    public VisitedCountries(List<CountryCovidHotelWeatherModel> countries) {
        this.countries = countries;
    }

    /**
     * Gets countries list.
     *
     * @return countries list.
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
