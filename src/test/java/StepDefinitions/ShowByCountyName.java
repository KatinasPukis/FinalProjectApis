package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lt.viko.eif.dziukas.FinalProjectApis.APIs.RESTCountries;

public class ShowByCountyName extends RESTCountries {
    @When("When the Client calls for a specific country by {string}")
    public void when_the_client_calls_for_a_specific_country_by_name(String country) {
        System.out.println(GetCountryByName(country));


    }
    @Then("It will send back the countrys info")
    public void it_will_send_back_the_countys_info() {



    }
}
