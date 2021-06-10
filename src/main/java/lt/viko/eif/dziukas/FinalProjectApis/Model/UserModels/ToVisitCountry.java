package lt.viko.eif.dziukas.FinalProjectApis.Model.UserModels;

import lt.viko.eif.dziukas.FinalProjectApis.Model.CountryCovidHotelWeatherModel;

/**
 * Represents ToVisitCountry object that has
 * main detailed country information model (countryCovidHotelWeatherModel)
 * of user wanted to visit country.
 *
 * @author Dainoras Ziukas, Valdemar Subotkovski, Dominykas Pleteras
 * @version 1.0
 * @since 1.0
 */
public class ToVisitCountry {

    private CountryCovidHotelWeatherModel countryCovidHotelWeatherModel;

    /**
     * Constructor for ToVisitCountry.
     *
     * @param countryCovidHotelWeatherModel detailed country model.
     */
    public ToVisitCountry(CountryCovidHotelWeatherModel countryCovidHotelWeatherModel) {
        this.countryCovidHotelWeatherModel = countryCovidHotelWeatherModel;
    }

    /**
     * Gets detailed country model.
     *
     * @return detailed country model.
     */
    public CountryCovidHotelWeatherModel getCountry() {
        return countryCovidHotelWeatherModel;
    }

    /**
     * Sets detailed country model.
     *
     * @param countryCovidHotelWeatherModel detailed country model.
     */
    public void setCountry(CountryCovidHotelWeatherModel countryCovidHotelWeatherModel) {
        this.countryCovidHotelWeatherModel = countryCovidHotelWeatherModel;
    }
}
