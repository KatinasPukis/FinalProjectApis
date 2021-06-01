package lt.viko.eif.dziukas.FinalProjectApis.Repositories;

import lt.viko.eif.dziukas.FinalProjectApis.APIs.BestCapitalHotel;
import lt.viko.eif.dziukas.FinalProjectApis.APIs.COVID19;
import lt.viko.eif.dziukas.FinalProjectApis.APIs.RESTCountries;
import lt.viko.eif.dziukas.FinalProjectApis.Model.BestCapitalHotelModel.Hotel;
import lt.viko.eif.dziukas.FinalProjectApis.Model.Country;
import lt.viko.eif.dziukas.FinalProjectApis.Model.RESTCountriesModels.Countries;

import java.util.List;

public class CountriesRepository {
// NEBAIGTA GALIMA KEIST VISKA SITOJ KLASEJ
    public Countries initializingCountries() {
        RESTCountries restCountries = new RESTCountries();
        Countries countries = restCountries.getAllCountries();
        return countries;
    }

    public List<Country> getCountries {
        Countries tempCountries = initializingCountries();
        lt.viko.eif.dziukas.FinalProjectApis.Model.Countries countries = new lt.viko.eif.dziukas.FinalProjectApis.Model.Countries();
        countries.setCountries(tempCountries.getCountries());
        return playerList;
    }


}
