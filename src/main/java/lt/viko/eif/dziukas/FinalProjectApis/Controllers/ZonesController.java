package lt.viko.eif.dziukas.FinalProjectApis.Controllers;

import lt.viko.eif.dziukas.FinalProjectApis.APIs.RESTCountries;
import lt.viko.eif.dziukas.FinalProjectApis.Model.ZonesModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping(value = "api/zones",  produces = MediaType.APPLICATION_JSON_VALUE)
public class ZonesController {
    private static RESTCountries countries = new RESTCountries();

    @GetMapping
    public ResponseEntity<EntityModel<ZonesModel>> GetAllZones() {

        EntityModel<ZonesModel> zoneCountries = EntityModel.of(countries.GetCountriesByZones());
        zoneCountries.add(linkTo(methodOn(ZonesController.class).GetAllZones()).withSelfRel());
        zoneCountries.add(linkTo(methodOn(CountryController.class).GetAllCountries()).withRel("get-all-countries"));
        return ResponseEntity.ok(zoneCountries);
    }
}
