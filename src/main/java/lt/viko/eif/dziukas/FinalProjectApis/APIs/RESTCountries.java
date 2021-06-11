package lt.viko.eif.dziukas.FinalProjectApis.APIs;

import com.google.gson.Gson;
import lt.viko.eif.dziukas.FinalProjectApis.Model.CountryCovidHotelWeatherModel;
import lt.viko.eif.dziukas.FinalProjectApis.Model.RESTCountriesModels.Countries;
import lt.viko.eif.dziukas.FinalProjectApis.Model.RESTCountriesModels.Country;
import lt.viko.eif.dziukas.FinalProjectApis.Model.ZonesModel;
import lt.viko.eif.dziukas.FinalProjectApis.Repositories.UserRepository;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Class represents RESTCountries API from https://rapidapi.com/ with its delegated methods,
 * it has four different methods getAllCountries, GetCountryCovidHotelWeatherByName,
 * GetCountryByName and GetCountryCapitalByName.
 *
 * @author Dainoras Ziukas, Valdemar Subotkovski, Dominykas Pleteras
 * @version 1.0
 * @since 1.0
 */
public class RESTCountries {

    private BestCapitalHotel hotel = new BestCapitalHotel();
    private COVID19 covid = new COVID19();
    private WeatherInCapital weather = new WeatherInCapital();
    private UserRepository repository = new UserRepository();
    /**
     * Method gets okHttpClient request from COVID19 api to get
     * all 250 countries data to the JSON Format, which afterwards
     * is parsed to POJO.
     *
     * @return Countries object or null if faulted
     */
    public Countries getAllCountries() {
        try {
            OkHttpClient client = new OkHttpClient();

            Request request = new Request.Builder()
                    .url("https://ajayakv-rest-countries-v1.p.rapidapi.com/rest/v1/all")
                    .get()
                    .addHeader("x-rapidapi-key", "3a72bede79msh3e5d354bbb1baa6p168035jsn8f45e363d125")
                    .addHeader("x-rapidapi-host", "ajayakv-rest-countries-v1.p.rapidapi.com")
                    .build();

            Response response = client.newCall(request).execute();
            String jsonFromResponse = response.body().string();

            JSONObject jsonObject = new JSONObject();
            JSONArray jsonArray = new JSONArray(jsonFromResponse);
            jsonObject.put("Countries",jsonArray);
            String json = String.valueOf(jsonObject);

            Gson gson = new Gson();
            Countries countries = gson.fromJson(json, Countries.class);

            return countries;
        }
        catch (Exception exc) {
            System.out.println(exc);
        }
        return null;
    }

    //make javadoc
    public ZonesModel GetCountriesByZones() {

        List<Country> red = new ArrayList<>();
        List<Country> yellow = new ArrayList<>();
        List<Country> green = new ArrayList<>();
        for (Country country: repository.GetWishlist().getCountries()) {
                Integer newCases = Integer.parseInt(covid.getCovidStatisticsByCountryAPI(country.getName()).getResponse().get(0).getCases().getNewCases());
                if( newCases >= 0 && newCases < 200 )
                    green.add(country);
                if( newCases >= 200 && newCases < 500 )
                    yellow.add(country);
                if(newCases >= 500)
                    red.add(country);
        }
        ZonesModel zones = new ZonesModel();
        zones.setRedZone(red);
        zones.setYellowZone(yellow);
        zones.setGreenZone(green);
        return zones;
    }

    /**
     * Method which represents combined Country model with
     * corresponded covid, hotel and weather information.
     *
     * @return CountryCovidHotelWeatherModel object or null if faulted.
     */
    public CountryCovidHotelWeatherModel GetCountryCovidHotelWeatherByName(String name) {
        try {

            CountryCovidHotelWeatherModel countryFull = new CountryCovidHotelWeatherModel();
            Country countryToAdd = new Country();

            for (Country country: getAllCountries().getCountries()) {
                if(country.getName().equals(name))
                {
                    countryToAdd = country;
                }
            }

            countryFull.setCountry(countryToAdd);
            countryFull.setBestHotelInCountriesCapital(hotel.getBestHotelInTheCapital(countryToAdd.getName(), countryToAdd.getCapital()));
            countryFull.setCovidStatistics(covid.getCovidStatisticsByCountryAPI(countryToAdd.getName()));
            countryFull.setWeather(weather.getCapitalWeather(countryToAdd.getName()));

            return countryFull;
        }
        catch (Exception exc) {
            System.out.println(exc);
        }
        return null;
    }

    /**
     * Method which finds the needed country by its name.
     *
     * @param name Countries name
     * @return the Country object or null if faulted
     */
    public Country GetCountryByName(String name) {
        try {
            for (Country temp: getAllCountries().getCountries()) {
                if(temp.getName().equals(name))
                {
                    return temp;
                }
            }
        }
        catch (Exception exc) {
            System.out.println(exc);
        }
        return null;
    }

    /**
     * Method which finds the countries capital city by countries name.
     *
     * @param countryName countries name
     * @return countries capital name or null if faulted
     */
    public String GetCountryCapitalByName(String countryName) {
        try {
            for (Country country: getAllCountries().getCountries()) {
                if(countryName.equals(country.getName())) {
                    return country.getCapital();
                }
            }
        }
        catch (Exception exc) {
            System.out.println(exc);
        }
        return null;
    }
}
