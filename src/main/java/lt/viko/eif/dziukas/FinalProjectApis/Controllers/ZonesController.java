package lt.viko.eif.dziukas.FinalProjectApis.Controllers;

import lt.viko.eif.dziukas.FinalProjectApis.APIs.RESTCountries;
import lt.viko.eif.dziukas.FinalProjectApis.Model.RESTCountriesModels.Country;
import lt.viko.eif.dziukas.FinalProjectApis.Model.ZonesModel;
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
@RequestMapping(value = "api/zones",  produces = MediaType.APPLICATION_JSON_VALUE)
public class ZonesController {
    private static RESTCountries countries = new RESTCountries();

    @GetMapping
    public ResponseEntity<EntityModel<ZonesModel>> GetAllZones() {

        EntityModel<ZonesModel> zoneCountries = EntityModel.of(countries.GetCountriesByZones());
        zoneCountries.add(linkTo(methodOn(ZonesController.class).GetAllZones()).withSelfRel());
        zoneCountries.add(linkTo(methodOn(CountryController.class).GetAllCountries()).withRel("get-all-countries"));
        return ResponseEntity.ok(zoneCountries);
    }

    @GetMapping("/red")
    public CollectionModel<EntityModel<Country>> GetRedZone() {

        List<EntityModel<Country>> zoneCountries = countries.GetRedZoneCountries(500).stream().map(
                country -> EntityModel.of(country,
                        linkTo(methodOn(CovidController.class).getCovidStatisticsByCountry(country.getName())).withRel("get-covid-statistics"),
                        linkTo(methodOn(HotelController.class).getHotelByCountryName(country.getName())).withRel("get-hotel-info"),
                        linkTo(methodOn(WeatherController.class).getWeatherByCountryName(country.getName())).withRel("get-weather-info"),
                        linkTo(methodOn(CountryController.class).GetCountryByName(country.getName())).withRel("get-country-info"),
                        //linkTo(methodOn(WishlistController.class).RemoveCountryFromWishlist(country.getName())).withRel("remove-country-from-wishlist"),
                        linkTo(methodOn(CountryController.class).GetAllCountries()).withRel("get-all-countries"))).collect(Collectors.toList());
        return CollectionModel.of(zoneCountries, linkTo(methodOn(ZonesController.class).GetRedZone()).withSelfRel(),
                linkTo(methodOn(CountryController.class).GetAllCountries()).withRel("get-all-countries"));
    }

    @GetMapping("/yellow")
    public CollectionModel<EntityModel<Country>> GetYellowZone() {

        List<EntityModel<Country>> zoneCountries = countries.GetYellowZoneCountries(200, 500).stream().map(
                country -> EntityModel.of(country,
                        linkTo(methodOn(CovidController.class).getCovidStatisticsByCountry(country.getName())).withRel("get-covid-statistics"),
                        linkTo(methodOn(HotelController.class).getHotelByCountryName(country.getName())).withRel("get-hotel-info"),
                        linkTo(methodOn(WeatherController.class).getWeatherByCountryName(country.getName())).withRel("get-weather-info"),
                        linkTo(methodOn(CountryController.class).GetCountryByName(country.getName())).withRel("get-country-info"),
                        //linkTo(methodOn(WishlistController.class).RemoveCountryFromWishlist(country.getName())).withRel("remove-country-from-wishlist"),
                        linkTo(methodOn(CountryController.class).GetAllCountries()).withRel("get-all-countries"))).collect(Collectors.toList());
        return CollectionModel.of(zoneCountries, linkTo(methodOn(ZonesController.class).GetYellowZone()).withSelfRel(),
                linkTo(methodOn(CountryController.class).GetAllCountries()).withRel("get-all-countries"));
    }

    @GetMapping("/green")
    public CollectionModel<EntityModel<Country>> GetGreenZone() {

        List<EntityModel<Country>> zoneCountries = countries.GetGreenZoneCountries(0, 200).stream().map(
                country -> EntityModel.of(country,
                        linkTo(methodOn(CovidController.class).getCovidStatisticsByCountry(country.getName())).withRel("get-covid-statistics"),
                        linkTo(methodOn(HotelController.class).getHotelByCountryName(country.getName())).withRel("get-hotel-info"),
                        linkTo(methodOn(WeatherController.class).getWeatherByCountryName(country.getName())).withRel("get-weather-info"),
                        linkTo(methodOn(CountryController.class).GetCountryByName(country.getName())).withRel("get-country-info"),
                        //linkTo(methodOn(WishlistController.class).RemoveCountryFromWishlist(country.getName())).withRel("remove-country-from-wishlist"),
                        linkTo(methodOn(CountryController.class).GetAllCountries()).withRel("get-all-countries"))).collect(Collectors.toList());
        return CollectionModel.of(zoneCountries, linkTo(methodOn(ZonesController.class).GetGreenZone()).withSelfRel(),
                linkTo(methodOn(CountryController.class).GetAllCountries()).withRel("get-all-countries"));
    }
}
