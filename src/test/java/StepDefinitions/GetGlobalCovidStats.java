package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lt.viko.eif.dziukas.FinalProjectApis.APIs.COVID19;
import lt.viko.eif.dziukas.FinalProjectApis.Model.COVID19Models.WorldStats;

public class GetGlobalCovidStats extends COVID19 {
    @When("The client calls a get request")
    public void the_client_calls_a_get_request() {
        System.out.println("Checking covid stats...");
    }
    @Then("The API returns global covid19 stats")
    public void the_api_returns_global_covid19_stats() {
        WorldStats worldStats = getCovid19WorldStats();
        System.out.println(worldStats.toString());
    }
}
