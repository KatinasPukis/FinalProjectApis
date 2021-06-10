package lt.viko.eif.dziukas.FinalProjectApis.Model.RESTCountriesModels;

import java.util.List;

/**
 * Represents Countries object that is a piece of
 * CountryCovidHotelWeather main model
 * and it represents detailed of the country like
 * calling codes, capital, region, population, timezones,
 * borders, languages and etc. information in a List.
 *
 * @author Dainoras Ziukas, Valdemar Subotkovski, Dominykas Pleteras
 * @version 1.0
 * @since 1.0
 */
public class Countries {
    private List<Country> Countries;

    /**
     * Just an empty constructor.
     *
     */
    public Countries() {

    }

    /**
     * Gets countries list.
     *
     * @return countries list.
     */
    public List<Country> getCountries() {
        return Countries;
    }

    /**
     * Sets countries list.
     *
     * @param Countries of the list.
     */
    public void setCountries(List<Country> Countries) {
        this.Countries = Countries;
    }

    /**
     * To String method that formats countries
     * object parameters for printing.
     *
     * @return the string with countries list information.
     */
    @Override
    public String toString() {
        return "Countries{" +
                "countries=" + Countries +
                '}';
    }
}
