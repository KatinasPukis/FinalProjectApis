package lt.viko.eif.dziukas.FinalProjectApis.Model.UserModels;

import lt.viko.eif.dziukas.FinalProjectApis.Model.CountryCovidHotelWeatherModel;

public class ToVisitCountry {
    private CountryCovidHotelWeatherModel countryCovidHotelWeatherModel;

    public ToVisitCountry(CountryCovidHotelWeatherModel countryCovidHotelWeatherModel) {
        this.countryCovidHotelWeatherModel = countryCovidHotelWeatherModel;
    }

    public CountryCovidHotelWeatherModel getCountry() {
        return countryCovidHotelWeatherModel;
    }

    public void setCountry(CountryCovidHotelWeatherModel countryCovidHotelWeatherModel) {
        this.countryCovidHotelWeatherModel = countryCovidHotelWeatherModel;
    }
}
