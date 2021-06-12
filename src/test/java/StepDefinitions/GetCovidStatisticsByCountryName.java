package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lt.viko.eif.dziukas.FinalProjectApis.APIs.COVID19;
import lt.viko.eif.dziukas.FinalProjectApis.Model.COVID19Models.Statistics;
import org.json.JSONArray;
import org.json.JSONObject;

public class GetCovidStatisticsByCountryName extends COVID19 {
    public Statistics covidStats = new Statistics();
    @When("When the Client calls for a specific {string} covid statistics")
    public void when_the_client_calls_for_a_specific_covid_statistics(String country) {
        covidStats=getCovidStatisticsByCountryAPI(country);
        //System.out.println(getCovidStatisticsByCountryAPI(country));
    }
    @Then("Then the info is returned")
    public void then_the_info_is_returned() {
        System.out.println(covidStats.toString());
    }
}
