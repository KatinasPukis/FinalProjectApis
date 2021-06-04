package lt.viko.eif.dziukas.FinalProjectApis.Model.UserModels;

import lt.viko.eif.dziukas.FinalProjectApis.Model.CountryCovidHotelWeatherModel;

import java.util.List;

public class VisitedCountries {
    private List<CountryCovidHotelWeatherModel> countries;

    public VisitedCountries(List<CountryCovidHotelWeatherModel> countries) {
        this.countries = countries;
    }

    public List<CountryCovidHotelWeatherModel> getCountries() {
        return countries;
    }

    public void setCountries(List<CountryCovidHotelWeatherModel> countries) {
        this.countries = countries;
    }
}
