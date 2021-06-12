package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lt.viko.eif.dziukas.FinalProjectApis.APIs.RESTCountries;

public class ShowCountryByName extends RESTCountries {
    @When("When the Client calls for a specific country")
    public void when_the_client_calls_for_a_specific_country() {

        System.out.println("Checking info...");

    }
    @Then("The country is returned with its {string}")
    public void the_country_is_returned_with_its(String string) {
        System.out.println(GetCountryByName(string));
    }
}
