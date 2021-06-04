package lt.viko.eif.dziukas.FinalProjectApis.Model.UserModels;

import lt.viko.eif.dziukas.FinalProjectApis.Model.CountryCovidHotelWeatherModel;

public class VisitedCountry {
    private CountryCovidHotelWeatherModel countryCovidHotelWeatherModel;

    public VisitedCountry(CountryCovidHotelWeatherModel countryCovidHotelWeatherModel) {
        this.countryCovidHotelWeatherModel = countryCovidHotelWeatherModel;
    }

    public CountryCovidHotelWeatherModel getCountry() {
        return countryCovidHotelWeatherModel;
    }

    public void setCountry(CountryCovidHotelWeatherModel countryCovidHotelWeatherModel) {
        this.countryCovidHotelWeatherModel = countryCovidHotelWeatherModel;
    }
}
