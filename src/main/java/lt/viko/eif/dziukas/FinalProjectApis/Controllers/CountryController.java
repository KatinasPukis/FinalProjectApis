package lt.viko.eif.dziukas.FinalProjectApis.Controllers;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lt.viko.eif.dziukas.FinalProjectApis.Model.CountryCovidHotelWeatherModel;
import lt.viko.eif.dziukas.FinalProjectApis.APIs.RESTCountries;
import lt.viko.eif.dziukas.FinalProjectApis.Model.RESTCountriesModels.Country;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

/**
 * Class represents Country controller with the two methods
 * named getAllCountries and GetCountryByName.
 *
 * @author Dainoras Ziukas, Valdemar Subotkovski, Dominykas Pleteras
 * @version 1.0
 * @since 1.0
 */

@RestController
@RequestMapping(value = "api/countries",  produces = MediaType.APPLICATION_JSON_VALUE)
public class CountryController {

    private static RESTCountries restcountries = new RESTCountries();

    /**
     * Method to get all countries - that turns resource to the
     * entity model and resources to the collection model for the
     * representation. Moreover every country entity model has
     * a corresponded HATEOAS self link and other related links.
     *
     * @return collection model of countries
     */

    @GetMapping
    public CollectionModel<EntityModel<Country>> GetAllCountries() {
        List<EntityModel<Country>> countries = restcountries.getAllCountries().getCountries().stream().map(
                        country -> EntityModel.of(country,
                        linkTo(methodOn(CountryController.class).GetCountryByName(country.getName())).withSelfRel(),
                        linkTo(methodOn(CovidController.class).getCovidStatisticsByCountry(country.getName())).withRel("get-covid-statistics"),
                        linkTo(methodOn(HotelController.class).getHotelByCountryName(country.getName())).withRel("get-hotel-info"),
                        linkTo(methodOn(WeatherController.class).getWeatherByCountryName(country.getName())).withRel("get-weather-info"),
                        linkTo(methodOn(WishlistController.class).AddCountryToWishlist(country.getName())).withRel("add-to-wishlist"),
                        linkTo(methodOn(VisitedCountriesController.class).AddCountryToVisited(country.getName())).withRel("add-to-visited"),
                        linkTo(methodOn(CountryController.class).GetAllCountries()).withRel("get-all-countries"))).collect(Collectors.toList());

        return CollectionModel.of(countries, linkTo(methodOn(CountryController.class).GetAllCountries()).withSelfRel());
    }

    /**
     * Method to get full country information (with weather, hotel, covid19 stats) by its name
     * The object is turned to entity model it has self link and other related links.
     *
     * @param name countries name
     * @return response entity ok - country
     */
    @GetMapping("/{countryName}")
    public ResponseEntity<EntityModel<CountryCovidHotelWeatherModel>> GetCountryByName(@PathVariable(value="countryName") String name){

        try {
            EntityModel<CountryCovidHotelWeatherModel> country = EntityModel.of(restcountries.GetCountryCovidHotelWeatherByName(name));
            country.add(linkTo(methodOn(CountryController.class).GetCountryByName(name)).withSelfRel());
            country.add(linkTo(methodOn(CovidController.class).getCovidStatisticsByCountry(name)).withRel("get-covid-statistics"));
            country.add(linkTo(methodOn(HotelController.class).getHotelByCountryName(name)).withRel("get-hotel-info"));
            country.add(linkTo(methodOn(WeatherController.class).getWeatherByCountryName(name)).withRel("get-weather-info"));
            country.add(linkTo(methodOn(WishlistController.class).AddCountryToWishlist(name)).withRel("add-to-wishlist"));
            country.add(linkTo(methodOn(VisitedCountriesController.class).AddCountryToVisited(name)).withRel("add-to-visited"));
            country.add(linkTo(methodOn(CountryController.class).GetAllCountries()).withRel("get-all-countries"));
            return ResponseEntity.ok(country);
        }
        catch(Exception exc) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); }
    }
}
