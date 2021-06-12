package lt.viko.eif.dziukas.FinalProjectApis.Repositories;

import lt.viko.eif.dziukas.FinalProjectApis.Model.COVID19Models.Response;
import lt.viko.eif.dziukas.FinalProjectApis.Model.COVID19Models.Statistics;
import lt.viko.eif.dziukas.FinalProjectApis.Model.RESTCountriesModels.Countries;
import lt.viko.eif.dziukas.FinalProjectApis.Model.RESTCountriesModels.Country;
import org.apache.catalina.User;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for UserRepository
 *
 * @author Dainoras Ziukas, Valdemar Subotkovski, Dominykas Pleteras
 * @version 1.0
 * @since 1.0
 */
class UserRepositoryTest {

    /**
     * Test of addCountryToWishlist method, of class CountryCovidHotelWeatherModel.
     */
    @Test
    void addCountryToWishlist() {
        UserRepository userRepository = new UserRepository();
        Countries wishlistCountries = userRepository.GetWishlist();
        List<Country> wishlistCountriesList = wishlistCountries.getCountries();
        try
        {
            userRepository.AddCountryToWishlist("Finland");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        Countries updatedWishlistCountries = userRepository.GetWishlist();
        List<Country> updatedWishlistCountriesList = updatedWishlistCountries.getCountries();
        assertEquals(wishlistCountriesList.size() + 1, updatedWishlistCountriesList.size());
    }

    /**
     * Test of removeCountryFromWishlist method, of class CountryCovidHotelWeatherModel.
     */
    @Test
    void removeCountryFromWishlist() {
        UserRepository userRepository = new UserRepository();
        Countries wishlistCountries = userRepository.GetWishlist();
        List<Country> wishlistCountriesList = wishlistCountries.getCountries();
        try
        {
            userRepository.RemoveCountryFromWishlist("Finland");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        Countries updatedWishlistCountries = userRepository.GetWishlist();
        List<Country> updatedWishlistCountriesList = updatedWishlistCountries.getCountries();
        assertEquals(wishlistCountriesList.size() - 1, updatedWishlistCountriesList.size());
    }

    /**
     * Test of addCountryToVisited method, of class CountryCovidHotelWeatherModel.
     */
    @Test
    void addCountryToVisited() {
        UserRepository userRepository = new UserRepository();
        Countries visitedCountries = userRepository.GetCountriesVisited();
        List<Country> visitedCountriesList = visitedCountries.getCountries();
        try
        {
            userRepository.AddCountryToVisited("Finland");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        Countries updatedVisitedCountries = userRepository.GetCountriesVisited();
        List<Country> updatedVisitedCountriesList = updatedVisitedCountries.getCountries();
        assertEquals(visitedCountriesList.size() + 1, updatedVisitedCountriesList.size());
    }

    /**
     * Test of removeCountryFromVisited method, of class CountryCovidHotelWeatherModel.
     */
    @Test
    void removeCountryFromVisited() {
        UserRepository userRepository = new UserRepository();
        Countries visitedCountries = userRepository.GetCountriesVisited();
        List<Country> visitedCountriesList = visitedCountries.getCountries();
        try
        {
            userRepository.RemoveCountryFromVisited("Finland");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        Countries updatedVisitedCountries = userRepository.GetCountriesVisited();
        List<Country> updatedVisitedCountriesList = updatedVisitedCountries.getCountries();
        assertEquals(visitedCountriesList.size() - 1, updatedVisitedCountriesList.size());
    }
}