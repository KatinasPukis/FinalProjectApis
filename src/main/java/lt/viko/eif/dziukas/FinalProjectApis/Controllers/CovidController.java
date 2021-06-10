package lt.viko.eif.dziukas.FinalProjectApis.Controllers;

import lt.viko.eif.dziukas.FinalProjectApis.APIs.COVID19;
import lt.viko.eif.dziukas.FinalProjectApis.Model.COVID19Models.Statistics;
import lt.viko.eif.dziukas.FinalProjectApis.Model.COVID19Models.WorldStats;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

/**
 * Class represents Covid controller with the two methods
 * named getWorldCovidStatistics and getCovidStatisticsByCountry.
 *
 * @author Dainoras Ziukas, Valdemar Subotkovski, Dominykas Pleteras
 * @version 1.0
 * @since 1.0
 */
@RestController
@RequestMapping(value = "api/covid",  produces = MediaType.APPLICATION_JSON_VALUE)
public class CovidController {

    private static COVID19 covid19 = new COVID19();

    /**
     * Method to get worlds covid statistics with the
     * entity model representation and corresponded links.
     *
     * @return response entity ok - worldStats
     */
    @GetMapping
    @ResponseBody
    public ResponseEntity<EntityModel<WorldStats>> getWorldCovidStatistics() {
        EntityModel<WorldStats> worldStats = EntityModel.of(covid19.getCovid19WorldStats());
        worldStats.add(linkTo(methodOn(CovidController.class).getWorldCovidStatistics()).withSelfRel());
        worldStats.add(linkTo(methodOn(CountryController.class).GetAllCountries()).withRel("get-all-countries"));
        return ResponseEntity.ok(worldStats);
    }

    /**
     * Method to get covid statistics by selected country, it uses
     * entity model representation of the statistics, has all related
     * HATEOAS links.
     *
     * @param country countries name
     * @return response entity ok - statistics
     */
    @GetMapping("/{country}")
    @ResponseBody
    public ResponseEntity<EntityModel<Statistics>> getCovidStatisticsByCountry(@PathVariable(value="country") String country) {
        EntityModel<Statistics> statistics = EntityModel.of(covid19.getCovidStatisticsByCountryAPI(country));
        statistics.add(linkTo(methodOn(CovidController.class).getCovidStatisticsByCountry(country)).withSelfRel());
        statistics.add(linkTo(methodOn(CountryController.class).GetAllCountries()).withRel("get-all-countries"));
        statistics.add(linkTo(methodOn(CountryController.class).GetCountryByName(country)).withRel("get-country-info"));
        statistics.add(linkTo(methodOn(CovidController.class).getWorldCovidStatistics()).withRel("get-world-stats"));
        return ResponseEntity.ok(statistics);
    }
}
