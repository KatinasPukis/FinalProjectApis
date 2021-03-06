package lt.viko.eif.dziukas.FinalProjectApis.APIs;

import com.google.gson.Gson;
import lt.viko.eif.dziukas.FinalProjectApis.Model.RESTCountriesModels.Countries;
import lt.viko.eif.dziukas.FinalProjectApis.Model.WeatherModel.Weather;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Class represents Weather API from https://rapidapi.com/,
 * it has one method named WeatherInCapital
 *
 * @author Dainoras Ziukas, Valdemar Subotkovski, Dominykas Pleteras
 * @version 1.0
 * @since 1.0
 */
public class WeatherInCapital {

    /***
     * Method gets okHttpClient request from Weather api to get
     * selected capital weather situation. Afterwards the JSON response is
     * subtracted and parsed to POJO.
     *
     * @param name Countries city (preferably countries capital city)
     * @return Weather object or null if faulted
     */
    public Weather getCapitalWeather(String name) {
        try {
            OkHttpClient client = new OkHttpClient();

            Request request = new Request.Builder()
                    .url("https://community-open-weather-map.p.rapidapi.com/find?q=" + name +"&cnt=1&mode=null&lon=0&type=link%2C%20accurate&lat=0&units=metric")
                    .get()
                    .addHeader("x-rapidapi-key", "3a72bede79msh3e5d354bbb1baa6p168035jsn8f45e363d125")
                    .addHeader("x-rapidapi-host", "community-open-weather-map.p.rapidapi.com")
                    .build();

            Response response = client.newCall(request).execute();
            String json = response.body().string();
            JSONObject jsonObject = new JSONObject(json);
            JSONArray countriesJson = new JSONArray(jsonObject.getJSONArray("list"));
            JSONObject obj = countriesJson.getJSONObject(0);
            JSONObject weather = obj.getJSONObject("main");
            String correctJson = String.valueOf(weather);

            Gson gson = new Gson();
            Weather weatherModel = gson.fromJson(correctJson, Weather.class);
            return weatherModel;
        }
        catch (Exception exc)
        {
            System.out.println(exc);
        }
        return null;
    }
}
