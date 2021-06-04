package lt.viko.eif.dziukas.FinalProjectApis.APIs;

import com.google.gson.Gson;
import lt.viko.eif.dziukas.FinalProjectApis.Model.BestCapitalHotelModel.Hotel;
import lt.viko.eif.dziukas.FinalProjectApis.Model.RESTCountriesModels.Country;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class BestCapitalHotel {
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
