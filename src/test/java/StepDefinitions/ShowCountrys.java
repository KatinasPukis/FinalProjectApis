package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lt.viko.eif.dziukas.FinalProjectApis.APIs.RESTCountries;

public class ShowCountrys extends RESTCountries {
    @When("When the Client calls countries")
    public void when_the_client_calls_api_countries() {
        getAllCountries();

    }
    @Then("Show all countries info")
    public void show_all_countries_info() {
        System.out.println(getAllCountries());

    }
}
