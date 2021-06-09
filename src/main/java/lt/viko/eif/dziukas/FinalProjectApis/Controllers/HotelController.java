package lt.viko.eif.dziukas.FinalProjectApis.Controllers;

import lt.viko.eif.dziukas.FinalProjectApis.APIs.BestCapitalHotel;
import lt.viko.eif.dziukas.FinalProjectApis.APIs.RESTCountries;
import lt.viko.eif.dziukas.FinalProjectApis.Model.BestCapitalHotelModel.Hotel;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping(value = "api/hotels",  produces = MediaType.APPLICATION_JSON_VALUE)
public class HotelController {
    private static BestCapitalHotel hotel = new BestCapitalHotel();
    private static RESTCountries countries = new RESTCountries();

    @GetMapping("/{countryName}")
    public ResponseEntity<EntityModel<Hotel>> getHotelByCountryName(@PathVariable(value="countryName") String countryName) {

        EntityModel<Hotel> returnHotel = EntityModel.of(hotel.getBestHotelInTheCapital(countryName, countries.GetCountryCapitalByName(countryName)));
        returnHotel.add(linkTo(methodOn(HotelController.class).getHotelByCountryName(countryName)).withSelfRel());
        returnHotel.add(linkTo(methodOn(CovidController.class).getCovidStatisticsByCountry(countryName)).withRel("get-country-covid-info"));
        returnHotel.add(linkTo(methodOn(WeatherController.class).getWeatherByCountryName(countryName)).withRel("get-country-weather-info"));
        returnHotel.add(linkTo(methodOn(CountryController.class).GetCountryByName(countryName)).withRel("get-country-info"));
        returnHotel.add(linkTo(methodOn(CountryController.class).GetAllCountries()).withRel("get-all-countries"));
        return ResponseEntity.ok(returnHotel);
    }
}
