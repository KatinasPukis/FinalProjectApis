package lt.viko.eif.dziukas.FinalProjectApis.Controllers;

import lt.viko.eif.dziukas.FinalProjectApis.Model.RESTCountriesModels.Country;
import lt.viko.eif.dziukas.FinalProjectApis.Repositories.UserRepository;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping(value = "api/visited",  produces = MediaType.APPLICATION_JSON_VALUE)
public class VisitedCountriesController {
    private static UserRepository repository = new UserRepository();

    @GetMapping
    public CollectionModel<EntityModel<Country>> GetAllVisitedCountries() {
        List<EntityModel<Country>> countries = repository.GetCountriesVisited().getCountries().stream().map(
                country -> EntityModel.of(country,
                        linkTo(methodOn(CovidController.class).getCovidStatisticsByCountry(country.getName())).withRel("get-covid-statistics"),
                        linkTo(methodOn(HotelController.class).getHotelByCountryName(country.getName())).withRel("get-hotel-info"),
                        linkTo(methodOn(WeatherController.class).getWeatherByCountryName(country.getName())).withRel("get-weather-info"),
                        linkTo(methodOn(CountryController.class).GetCountryByName(country.getName())).withRel("get-country-info"),
                        linkTo(methodOn(CountryController.class).GetAllCountries()).withRel("get-all-countries"))).collect(Collectors.toList());
        return CollectionModel.of(countries, linkTo(methodOn(VisitedCountriesController.class).GetAllVisitedCountries()).withSelfRel());
    }

//    @GetMapping("/visited")
//    public ResponseEntity() {
//        List<EntityModel<Country>> countries = repository.GetCountriesVisited().getCountries().stream().map(
//                country -> EntityModel.of(country,
//                        linkTo(methodOn(CovidController.class).getCovidStatisticsByCountry(country.getName())).withRel("get-covid-statistics"),
//                        linkTo(methodOn(HotelController.class).getHotelByCountryName(country.getName())).withRel("get-hotel-info"),
//                        linkTo(methodOn(WeatherController.class).getWeatherByCountryName(country.getName())).withRel("get-weather-info"),
//                        linkTo(methodOn(CountryController.class).GetCountryByName(country.getName())).withRel("get-country-info"),
//                        linkTo(methodOn(CountryController.class).GetAllCountries()).withRel("get-all-countries"))).collect(Collectors.toList());
//        return CollectionModel.of(countries, linkTo(methodOn(VisitedCountriesController.class).GetAllVisitedCountries()).withSelfRel());
//    }

}
