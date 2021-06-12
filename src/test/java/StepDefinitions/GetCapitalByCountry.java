package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lt.viko.eif.dziukas.FinalProjectApis.APIs.RESTCountries;
import lt.viko.eif.dziukas.FinalProjectApis.Model.RESTCountriesModels.Country;

public class GetCapitalByCountry extends RESTCountries {
    public String capitalName;
    @When("When the Client calls for a specific {string}")
    public void when_the_client_calls_for_a_specific(String country) {
        capitalName = GetCountryCapitalByName(country);

    }
    @Then("The API returns the capital city of the country")
    public void the_api_returns_the_capital_city_of_the_country() {
        System.out.println(capitalName);
    }
}
