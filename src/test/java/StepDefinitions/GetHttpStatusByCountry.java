package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.Assert;

import java.io.IOException;

public class GetHttpStatusByCountry {
    private String responseBody;
    private Response response;
    private static final String BASE_URL = "http://localhost:5050";
    private static final OkHttpClient client = new OkHttpClient();
    private String countryName;

    @When("When the client calls for a specific {string}")
    public void client_calls_country_by_name(String name) throws IOException {

        countryName = name;
        Request request = new Request.Builder()
                .url(BASE_URL + "/api/countries/" + name)
                .build();
        Call call = client.newCall(request);
        response = call.execute();
        responseBody = response.body().string();
    }

    @Then("HTTP status code is {int}")
    public void http_status_cods_is(int code) {

        Assert.assertEquals(code, response.networkResponse().code());
    }

    @Then("The API returns country")
    public void the_api_returns_country() throws IOException {

        Request request = new Request.Builder()
                .url(BASE_URL + "/api/countries/" + countryName)
                .build();
        Call call = client.newCall(request);
        Assert.assertEquals(responseBody, call.execute().body().string());
    }
}
