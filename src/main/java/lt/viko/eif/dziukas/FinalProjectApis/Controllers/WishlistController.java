package lt.viko.eif.dziukas.FinalProjectApis.Controllers;

import lt.viko.eif.dziukas.FinalProjectApis.Model.RESTCountriesModels.Country;
import lt.viko.eif.dziukas.FinalProjectApis.Repositories.UserRepository;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

/**
 * Class represents Wishlist Countries controller with the three methods
 * named getAllVisitedCountries, AddCountryToWishlist and RemoveCountryFromWishlist.
 *
 * @author Dainoras Ziukas, Valdemar Subotkovski, Dominykas Pleteras
 * @version 1.0
 * @since 1.0
 */
@RestController
@RequestMapping(value = "api/wishlist",  produces = MediaType.APPLICATION_JSON_VALUE)
public class WishlistController {
    private static UserRepository repository = new UserRepository();

    /**
     * Method dedicated to get the wishlist (wish to visit) countries from repository and turn it into
     * collection model with each country being entity model. Every entity model has
     * all related HATEOAS links.
     *
     * @return collection model of entity model countries with corresponded links.
     */
    @GetMapping
    public CollectionModel<EntityModel<Country>> GetAllVisitedCountries() {
        List<EntityModel<Country>> countries = repository.GetWishlist().getCountries().stream().map(
                country -> EntityModel.of(country,
                        linkTo(methodOn(CovidController.class).getCovidStatisticsByCountry(country.getName())).withRel("get-covid-statistics"),
                        linkTo(methodOn(HotelController.class).getHotelByCountryName(country.getName())).withRel("get-hotel-info"),
                        linkTo(methodOn(WeatherController.class).getWeatherByCountryName(country.getName())).withRel("get-weather-info"),
                        linkTo(methodOn(CountryController.class).GetCountryByName(country.getName())).withRel("get-country-info"),
                        linkTo(methodOn(WishlistController.class).RemoveCountryFromWishlist(country.getName())).withRel("remove-country-from-wishlist"),
                        linkTo(methodOn(CountryController.class).GetAllCountries()).withRel("get-all-countries"))).collect(Collectors.toList());
        return CollectionModel.of(countries, linkTo(methodOn(WishlistController.class).GetAllVisitedCountries()).withSelfRel(),
            linkTo(methodOn(CountryController.class).GetAllCountries()).withRel("get-all-countries"));
    }

    /**
     * Method dedicated to POST a new country into wishlist repository table with path variable country name.
     *
     * @param countryName countries name
     * @return response entity string (If added - CREATED, if doesn't exist - NOT_FOUND, if it's already added - CONFLICT)
     */
    @PostMapping("{countryName}")
    public ResponseEntity<String> AddCountryToWishlist(@PathVariable(value="countryName") String countryName) {

        try {
            repository.AddCountryToWishlist(countryName);
            return new ResponseEntity<>("resource created successfully", HttpStatus.CREATED);
        }
        catch(Exception exc) {
            System.out.println(exc.getMessage());
            if(exc.getMessage().equals("country does not exist")){
                return new ResponseEntity<>(exc.getMessage(), HttpStatus.NOT_FOUND);}
            else
                return new ResponseEntity<>(exc.getMessage(), HttpStatus.CONFLICT);
        }
    }

    /**
     * Method dedicated to DELETE a selected country from wishlist
     * repository table with path variable country name.
     *
     * @param countryName countries name
     * @return Response entity string (if successfully removed - OK, if country doesn't exist - NOT_FOUND)
     */
    @DeleteMapping("{countryName}")
    public ResponseEntity<String> RemoveCountryFromWishlist(@PathVariable(value="countryName") String countryName){
        try {
            repository.RemoveCountryFromWishlist(countryName);
            return new ResponseEntity<>("resource removed successfully", HttpStatus.OK);
        }
        catch(Exception exc) {
            System.out.println(exc.getMessage());
            return new ResponseEntity<>(exc.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}
