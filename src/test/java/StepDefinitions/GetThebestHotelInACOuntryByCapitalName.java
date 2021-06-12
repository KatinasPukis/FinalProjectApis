package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lt.viko.eif.dziukas.FinalProjectApis.APIs.BestCapitalHotel;
import lt.viko.eif.dziukas.FinalProjectApis.Model.BestCapitalHotelModel.Hotel;

public class GetThebestHotelInACOuntryByCapitalName extends BestCapitalHotel {
    public Hotel bestHotel = new Hotel();
    @When("When the Client calls for a specific {string} and a {string}")
    public void when_the_client_calls_for_a_specific_and_a(String country, String capital) {
        bestHotel=getBestHotelInTheCapital(country,capital);
    }
    @Then("The API returns the best hotel")
    public void the_api_returns_the_best_hotel() {
        System.out.println(bestHotel);
    }
}
