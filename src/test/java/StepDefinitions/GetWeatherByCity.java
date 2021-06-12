package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lt.viko.eif.dziukas.FinalProjectApis.APIs.WeatherInCapital;
import lt.viko.eif.dziukas.FinalProjectApis.Model.WeatherModel.Weather;

public class GetWeatherByCity {
    private static WeatherInCapital weather = new WeatherInCapital();
    public Weather weatherInfo = new Weather();
    @When("When the client calls for a specific capital {string}")
    public void when_the_client_calls_for_a_specific_capital(String city) {
        weatherInfo = weather.getCapitalWeather(city);
    }
    @Then("The API returns the weather")
    public void the_api_returns_the_weather() {
        System.out.println(weatherInfo);
    }
}
