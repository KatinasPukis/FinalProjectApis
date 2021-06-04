package lt.viko.eif.dziukas.FinalProjectApis.Controllers;

import lt.viko.eif.dziukas.FinalProjectApis.APIs.COVID19;
import lt.viko.eif.dziukas.FinalProjectApis.Model.COVID19Models.Root;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class CovidController {
    private static COVID19 covid19 = new COVID19();

    @GetMapping("/covid/{country}")
    @ResponseBody
    public ResponseEntity<EntityModel<Root>> getCovidStatisticsByCountry(@PathVariable(value="country") String country) {

        EntityModel<Root> statistics = EntityModel.of(covid19.getCovidStatisticsByCountryAPI(country));
        final String selfString = ServletUriComponentsBuilder.fromCurrentRequest().build().toUriString();

        statistics.add(linkTo(methodOn(CountryController.class).GetAllCountries()).withRel("get-all-countries"));
        return ResponseEntity.ok(statistics);
    }
}
