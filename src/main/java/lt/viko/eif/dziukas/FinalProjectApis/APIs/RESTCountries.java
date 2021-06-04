package lt.viko.eif.dziukas.FinalProjectApis.APIs;

import com.google.gson.Gson;
import lt.viko.eif.dziukas.FinalProjectApis.Model.CountryCovidHotelWeatherModel;
import lt.viko.eif.dziukas.FinalProjectApis.Model.RESTCountriesModels.Countries;
import lt.viko.eif.dziukas.FinalProjectApis.Model.RESTCountriesModels.Country;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

public class RESTCountries {
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
            //System.out.println("jsonFromResponse: "+ jsonFromResponse);


            JSONObject jsonObject = new JSONObject();
            JSONArray jsonArray = new JSONArray(jsonFromResponse);
            jsonObject.put("Countries",jsonArray);
            String json = String.valueOf(jsonObject);

            Gson gson = new Gson();
            Countries countries = gson.fromJson(json, Countries.class);


            System.out.println("POJO: " + countries);
            return countries;
        }
        catch (Exception exc) {
            System.out.println(exc);
        }
        return null;
    }

    /**
     * Model which represents country model with covid, hotel and weather information.
     *
     * @return CountryCovidHotelWeatherModel object or null if faulted.
     */
    public CountryCovidHotelWeatherModel GetCountryByID() {
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
            //System.out.println("jsonFromResponse: "+ jsonFromResponse);


            JSONObject jsonObject = new JSONObject();
            JSONArray jsonArray = new JSONArray(jsonFromResponse);
            jsonObject.put("Countries",jsonArray);
            String json = String.valueOf(jsonObject);

            Gson gson = new Gson();
            Countries countries = gson.fromJson(json, Countries.class);


            System.out.println("POJO: " + countries);
            return countries;
        }
        catch (Exception exc) {
            System.out.println(exc);
        }
        return null;
    }

}
