package lt.viko.eif.dziukas.FinalProjectApis.Controllers;

import lt.viko.eif.dziukas.FinalProjectApis.APIs.COVID19;
import lt.viko.eif.dziukas.FinalProjectApis.Model.CountryCovidHotelWeatherModel;
import lt.viko.eif.dziukas.FinalProjectApis.APIs.RESTCountries;
import lt.viko.eif.dziukas.FinalProjectApis.Model.RESTCountriesModels.Country;
import lt.viko.eif.dziukas.FinalProjectApis.Model.WeatherModel.Weather;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class CountryController {
    private static RESTCountries restcountries = new RESTCountries();

    @GetMapping("/countries")
    public CollectionModel<EntityModel<Country>> GetAllCountries() {

        List<EntityModel<Country>> countries = restcountries.getAllCountries().getCountries().stream().map(
                        country -> EntityModel.of(country,
                        linkTo(methodOn(CountryController.class).GetCountryByName(country.getName())).withSelfRel(),
                        linkTo(methodOn(CountryController.class).GetAllCountries()).withRel("get-all-countries"))).collect(Collectors.toList());
        return CollectionModel.of(countries, linkTo(methodOn(CountryController.class).GetAllCountries()).withSelfRel());
    }

    @GetMapping("/countries/{countryName}")
    public ResponseEntity<EntityModel<CountryCovidHotelWeatherModel>> GetCountryByName(@PathVariable(value="countryName") String name){

        EntityModel<CountryCovidHotelWeatherModel> country = EntityModel.of(restcountries.GetCountryByName(name));
        country.add(linkTo(methodOn(CovidController.class).getCovidStatisticsByCountry(name)).withRel("get-covid-statistics"));
        country.add(linkTo(methodOn(HotelController.class).getHotelByCountryName(name)).withRel("get-hotel-info"));
        country.add(linkTo(methodOn(WeatherController.class).getWeatherByCountryName(name)).withRel("get-weather-info"));
        return ResponseEntity.ok(country);
    }
}
