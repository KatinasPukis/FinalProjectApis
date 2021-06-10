package lt.viko.eif.dziukas.FinalProjectApis.APIs;

import lt.viko.eif.dziukas.FinalProjectApis.Model.COVID19Models.Statistics;
import com.google.gson.Gson;
import lt.viko.eif.dziukas.FinalProjectApis.Model.COVID19Models.WorldStats;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Class represents two different COVID19 API's from https://rapidapi.com/,
 * has two methods getCovidStatisticsByCountryAPI and getCOVID19WorldStats.
 *
 * @author Dainoras Ziukas, Valdemar Subotkovski, Dominykas Pleteras
 * @version 1.0
 * @since 1.0
 */
public class COVID19 {

    /**
     * Method gets okHttpClient request from COVID19 api to get
     * the covid stats per country. After that, these stats
     * are parsed from JSON to POJO.
     *
     * @param country selected country name.
     * @return Statistics object or null if faulted.
     */
    public Statistics getCovidStatisticsByCountryAPI (String country) {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://covid-193.p.rapidapi.com/statistics?country=" + country)
                .get()
                .addHeader("x-rapidapi-key", "3a72bede79msh3e5d354bbb1baa6p168035jsn8f45e363d125")
                .addHeader("x-rapidapi-host", "covid-193.p.rapidapi.com")
                .build();

        Response response = null;
        try {
            response = client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String json = null;
        try {
            json = response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        JSONObject jsonObject = new JSONObject(json);
        JSONArray countryStatistic = new JSONArray(jsonObject.getJSONArray("response"));

        JSONObject obj = new JSONObject();
        try {
            obj.put("response", countryStatistic); // prie masyvo prirasau zodi countries paversdamas ji ne masyvu, o visu objektu, kad vps leistu parse'int (countries:(saliu pavadinimu masyvas))
        } catch(JSONException e) {
            e.printStackTrace();
        }
        Gson gson = new Gson();
        String correntJsonString = String.valueOf(obj);
        Statistics CountryResponse = gson.fromJson(correntJsonString, Statistics.class);
        return CountryResponse;
    }

    /**
     * Method gets okHttpClient request from COVID19 api to get
     * world stats of corona cases, deaths, tests and etc in JSON format,
     * after that, JSON is parsed to POJO class.
     *
     * @return WorldStats object or null if faulted.
     */
    public WorldStats getCovid19WorldStats() {
        try {
            OkHttpClient client = new OkHttpClient();

            Request request = new Request.Builder()
                    .url("https://covid-19-tracking.p.rapidapi.com/v1/world")
                    .get()
                    .addHeader("x-rapidapi-key", "3a72bede79msh3e5d354bbb1baa6p168035jsn8f45e363d125")
                    .addHeader("x-rapidapi-host", "covid-19-tracking.p.rapidapi.com")
                    .build();

            Response response = client.newCall(request).execute();

            Gson gson = new Gson();
            String json = response.body().string();

            WorldStats worldStats = gson.fromJson(json, WorldStats.class);
            return worldStats;
        }
        catch (Exception exc) {
            System.out.println(exc);
        }
        return null;
    }
}
