package lt.viko.eif.dziukas.FinalProjectApis.Controllers;

import lt.viko.eif.dziukas.FinalProjectApis.Model.RESTCountriesModels.Country;
import lt.viko.eif.dziukas.FinalProjectApis.Repositories.UserRepository;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class WishlistController {
    private static UserRepository repository = new UserRepository();

    @GetMapping("/wishlist")
    public CollectionModel<EntityModel<Country>> GetAllVisitedCountries() {
        List<EntityModel<Country>> countries = repository.GetWishlist().getCountries().stream().map(
                country -> EntityModel.of(country,
                        linkTo(methodOn(CountryController.class).GetCountryByName(country.getName())).withSelfRel(),
                        linkTo(methodOn(CovidController.class).getCovidStatisticsByCountry(country.getName())).withRel("get-covid-statistics"),
                        linkTo(methodOn(HotelController.class).getHotelByCountryName(country.getName())).withRel("get-hotel-info"),
                        linkTo(methodOn(WeatherController.class).getWeatherByCountryName(country.getName())).withRel("get-weather-info"),
                        linkTo(methodOn(CountryController.class).GetAllCountries()).withRel("get-all-countries"))).collect(Collectors.toList());
        return CollectionModel.of(countries, linkTo(methodOn(CountryController.class).GetAllCountries()).withSelfRel());
    }
}