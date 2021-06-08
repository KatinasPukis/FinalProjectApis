package lt.viko.eif.dziukas.FinalProjectApis.Controllers;

import lt.viko.eif.dziukas.FinalProjectApis.APIs.COVID19;
import lt.viko.eif.dziukas.FinalProjectApis.Model.COVID19Models.Statistics;
import lt.viko.eif.dziukas.FinalProjectApis.Model.COVID19Models.WorldStats;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.swing.text.html.parser.Entity;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class CovidController {
    private static COVID19 covid19 = new COVID19();

    @GetMapping("/covid/{country}")
    @ResponseBody
    public ResponseEntity<EntityModel<Statistics>> getCovidStatisticsByCountry(@PathVariable(value="country") String country) {
        EntityModel<Statistics> statistics = EntityModel.of(covid19.getCovidStatisticsByCountryAPI(country));
        statistics.add(linkTo(methodOn(CountryController.class).GetAllCountries()).withRel("get-all-countries"));
        statistics.add(linkTo(methodOn(CovidController.class).getWorldCovidStatistics()).withRel("get-world-stats"));
        return ResponseEntity.ok(statistics);
    }
    @GetMapping("/covid")
    @ResponseBody
    public ResponseEntity<EntityModel<WorldStats>> getWorldCovidStatistics() {
        EntityModel<WorldStats> worldStats = EntityModel.of(covid19.getCovid19WorldStats());
        worldStats.add(linkTo(methodOn(CovidController.class).getWorldCovidStatistics()).withSelfRel());
        return ResponseEntity.ok(worldStats);
    }
}
