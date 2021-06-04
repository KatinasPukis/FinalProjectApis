package lt.viko.eif.dziukas.FinalProjectApis.Controllers;

import lt.viko.eif.dziukas.FinalProjectApis.APIs.BestCapitalHotel;
import lt.viko.eif.dziukas.FinalProjectApis.APIs.RESTCountries;
import lt.viko.eif.dziukas.FinalProjectApis.Model.BestCapitalHotelModel.Hotel;
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
public class HotelController {
    private static BestCapitalHotel hotel = new BestCapitalHotel();
    private static RESTCountries countries = new RESTCountries();

    @GetMapping("/hotels/{countryName}")
    public ResponseEntity<EntityModel<Hotel>> getHotelByCountryName(@PathVariable(value="countryName") String countryName) {

        EntityModel<Hotel> returnHotel = EntityModel.of(hotel.getBestHotelInTheCapital(countryName, countries.GetCountryCapitalByName(countryName)));
        returnHotel.add(linkTo(methodOn(CountryController.class).GetAllCountries()).withRel("get-all-countries"));
        return ResponseEntity.ok(returnHotel);
    }
}
