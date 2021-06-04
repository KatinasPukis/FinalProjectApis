package lt.viko.eif.dziukas.FinalProjectApis.Controllers;

import lt.viko.eif.dziukas.FinalProjectApis.APIs.WeatherInCapital;
import lt.viko.eif.dziukas.FinalProjectApis.Model.BestCapitalHotelModel.Hotel;
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
        returnWeather.add(linkTo(methodOn(CountryController.class).GetAllCountries()).withRel("get-all-countries"));
        return ResponseEntity.ok(returnWeather);
    }
}
