package lt.viko.eif.dziukas.FinalProjectApis.Model;

import lt.viko.eif.dziukas.FinalProjectApis.Model.BestCapitalHotelModel.Hotel;
import lt.viko.eif.dziukas.FinalProjectApis.Model.COVID19Models.Root;
import lt.viko.eif.dziukas.FinalProjectApis.Model.RESTCountriesModels.Country;
import lt.viko.eif.dziukas.FinalProjectApis.Model.WeatherModel.Weather;


public class CountryCovidHotelWeatherModel {
    private Country country;
    private Hotel bestHotelInCountriesCapital; // MOKAMAS Api, 10max XDD
    private Root covidStatistics;
    private Weather weather;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Hotel getBestHotelInCountriesCapital() {
        return bestHotelInCountriesCapital;
    }

    public void setBestHotelInCountriesCapital(Hotel bestHotelInCountriesCapital) {
        this.bestHotelInCountriesCapital = bestHotelInCountriesCapital;
    }

    public Root getCovidStatistics() {
        return covidStatistics;
    }

    public void setCovidStatistics(Root covidStatistics) {
        this.covidStatistics = covidStatistics;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }
}
