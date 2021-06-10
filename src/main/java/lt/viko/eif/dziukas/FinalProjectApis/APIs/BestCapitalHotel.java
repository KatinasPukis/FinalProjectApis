package lt.viko.eif.dziukas.FinalProjectApis.APIs;

import com.google.gson.Gson;
import lt.viko.eif.dziukas.FinalProjectApis.Model.BestCapitalHotelModel.Hotel;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Class represents Hotel API from https://rapidapi.com/,
 * it has one method named getBestHotelInTheCapital.
 *
 * @author Dainoras Ziukas, Valdemar Subotkovski, Dominykas Pleteras
 * @version 1.0
 * @since 1.0
 */
public class BestCapitalHotel {

    /**
     * Method gets okHttpClient request from hotel api to get
     * the best hotel in the dedicated city and
     * parses the json response to the POJO.
     *
     * @param countryName Countries name.
     * @param countryCapital selected countries any city (preferably countries capital city).
     * @return the Hotel object or null if faulted.
     */
    public Hotel getBestHotelInTheCapital (String countryName, String countryCapital) {
        try {
            OkHttpClient client = new OkHttpClient();

            Request request = new Request.Builder()
                    .url("https://best-booking-com-hotel.p.rapidapi.com/booking/best-accommodation?cityName=" + countryCapital +"&countryName=" + countryName)
                    .get()
                    .addHeader("x-rapidapi-key", "3a72bede79msh3e5d354bbb1baa6p168035jsn8f45e363d125")
                    .addHeader("x-rapidapi-host", "best-booking-com-hotel.p.rapidapi.com")
                    .build();

            Response response = client.newCall(request).execute();

            String json = response.body().string();

            Gson gson = new Gson();
            Hotel hotel = gson.fromJson(json, Hotel.class);

            return hotel;
        }
        catch (Exception exc){
            System.out.println(exc);
        }
        return null;
    }
}
