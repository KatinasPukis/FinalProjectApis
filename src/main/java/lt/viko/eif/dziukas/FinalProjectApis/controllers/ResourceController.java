package lt.viko.eif.dziukas.FinalProjectApis.controllers;

import lt.viko.eif.dziukas.FinalProjectApis.APIs.COVID19;
import lt.viko.eif.dziukas.FinalProjectApis.Model.COVID19Models.Root;
import lt.viko.eif.dziukas.FinalProjectApis.Model.CountryCovidHotelWeatherModel;
import lt.viko.eif.dziukas.FinalProjectApis.APIs.RESTCountries;
import lt.viko.eif.dziukas.FinalProjectApis.Model.RESTCountriesModels.Country;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class ResourceController {
    private COVID19 covid19 = new COVID19();
    private RESTCountries restcountries = new RESTCountries();

    @GetMapping("/countries")
    public CollectionModel<EntityModel<Country>> index() {

        List<EntityModel<Country>> countries = restcountries.getAllCountries().getCountries().stream().map(
                        Country -> EntityModel.of(Country,
                        //linkTo(methodOn(ResourceController.class).getCovidStatisticsById(countryTemp.getCountryName())).withSelfRel(),
                        linkTo(methodOn(ResourceController.class).index()).withRel("get-all-countries"))).collect(Collectors.toList());
        return CollectionModel.of(countries, linkTo(methodOn(ResourceController.class).index()).withSelfRel());
    }

    @GetMapping("/countries/{countryName}")
    public ResponseEntity<EntityModel<CountryCovidHotelWeatherModel>> index2(@PathVariable(value="countryName") String name){
        //CountryCovidHotelWeatherModel mainModel = restcountries.GetCountryByID();

        EntityModel<CountryCovidHotelWeatherModel> country = EntityModel.of(restcountries.GetCountryByName(name));
        return ResponseEntity.ok(country);
    }

    @GetMapping("/covid/{country}")
    @ResponseBody
    public ResponseEntity<EntityModel<Root>> getCovidStatisticsById(@PathVariable(value="country", required = false) String country) {

        EntityModel<Root> statistics = EntityModel.of(covid19.getCovidStatisticsByCountryAPI(country));
        final String selfString = ServletUriComponentsBuilder.fromCurrentRequest().build().toUriString();

        statistics.add(linkTo(methodOn(ResourceController.class).index()).withRel("get-all-countries"));
        return ResponseEntity.ok(statistics);
    }
}