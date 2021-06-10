package lt.viko.eif.dziukas.FinalProjectApis.Controllers;

import lt.viko.eif.dziukas.FinalProjectApis.APIs.WeatherInCapital;
import lt.viko.eif.dziukas.FinalProjectApis.Model.WeatherModel.Weather;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

/**
 * Class represents Weather controller with the single method
 * named getWeatherByCountryName.
 *
 * @author Dainoras Ziukas, Valdemar Subotkovski, Dominykas Pleteras
 * @version 1.0
 * @since 1.0
 */
@RestController
@RequestMapping(value = "api/weather",  produces = MediaType.APPLICATION_JSON_VALUE)
public class WeatherController {

    private static WeatherInCapital weather = new WeatherInCapital();

    /**
     * Method dedicated to get the the capital weather by country and return it
     * with representational entity model.
     * This model has all related HATEOAS links.
     *
     * @param countryName countries name
     * @return response entity ok - weather
     */
    @GetMapping("/{countryName}")
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
