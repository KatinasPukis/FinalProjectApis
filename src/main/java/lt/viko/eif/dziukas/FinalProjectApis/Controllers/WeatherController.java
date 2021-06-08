package lt.viko.eif.dziukas.FinalProjectApis.Controllers;

import lt.viko.eif.dziukas.FinalProjectApis.APIs.WeatherInCapital;
import lt.viko.eif.dziukas.FinalProjectApis.Model.WeatherModel.Weather;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class WeatherController {
    private static WeatherInCapital weather = new WeatherInCapital();

    @GetMapping("/weather/{countryName}")
    public ResponseEntity<EntityModel<Weather>> getWeatherByCountryName(@PathVariable(value="countryName") String countryName) {

        EntityModel<Weather> returnWeather = EntityModel.of(weather.getCapitalWeather(countryName));
        returnWeather.add(linkTo(methodOn(WeatherController.class).getWeatherByCountryName(countryName)).withSelfRel());
        returnWeather.add(linkTo(methodOn(CovidController.class).getCovidStatisticsByCountry(countryName)).withRel("get-country-covid-info"));
        returnWeather.add(linkTo(methodOn(HotelController.class).getHotelByCountryName(countryName)).withRel("get-country-hotel-info"));
        returnWeather.add(linkTo(methodOn(CountryController.class).GetCountryByName(countryName)).withRel("get-country-info"));
        returnWeather.add(linkTo(methodOn(CountryController.class).GetAllCountries()).withRel("get-all-countries"));
        return ResponseEntity.ok(returnWeather);
    }
}
