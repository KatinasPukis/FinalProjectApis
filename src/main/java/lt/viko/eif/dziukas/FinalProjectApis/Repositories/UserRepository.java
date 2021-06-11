package lt.viko.eif.dziukas.FinalProjectApis.Repositories;

import lt.viko.eif.dziukas.FinalProjectApis.APIs.RESTCountries;
import lt.viko.eif.dziukas.FinalProjectApis.Model.RESTCountriesModels.Countries;
import lt.viko.eif.dziukas.FinalProjectApis.Model.RESTCountriesModels.Country;
import org.springframework.hateoas.RepresentationModel;
import springfox.documentation.service.Representation;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Class represents UserRepository which is dedicated to
 * repository integration with the project and sql commands for the
 * selected methods.
 *
 * @author Dainoras Ziukas, Valdemar Subotkovski, Dominykas Pleteras
 * @version 1.0
 * @since 1.0
 */
public class UserRepository extends RepresentationModel {
    private static RESTCountries countriesAPI = new RESTCountries();

    /**
     * Method that takes from repository table all the visited countries
     *
     * @return visited countries.
     */
    public Countries GetCountriesVisited() {
        try
        {
            List<Country> countriesList = new ArrayList<>();
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/final_project","root","");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from countryvisited");
            while (resultSet.next()){
                countriesList.add(countriesAPI.GetCountryByName(resultSet.getString("Country")));
            }
            Countries countries = new Countries();
            countries.setCountries(countriesList);
            return countries;
        }
        catch(Exception exc)
        {
            return null;
        }
    }

    /**
     * Method that takes all the ,,wish to visit" countries from the repository table.
     *
     * @return wishlist countries.
     */
    public Countries GetWishlist() {
        try
        {
            List<Country> countriesList = new ArrayList<>();
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/final_project","root","");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from countrytovisit");
            while (resultSet.next()){
                countriesList.add(countriesAPI.GetCountryByName(resultSet.getString("Country")));
            }
            Countries countries = new Countries();
            countries.setCountries(countriesList);
            return countries;
        }
        catch(Exception exc)
        {
            return null;
        }
    }

    /**
     * Method that adds country to the wishlist table repository.
     *
     * @param countryName country name.
     * @throws Exception if country doesn't exist or already added into the table.
     */
    public void AddCountryToWishlist(String countryName) throws Exception {

        try {
            for (Country country: countriesAPI.getAllCountries().getCountries()) {
                if(countryName.equals(country.getName())){
                    try {
                        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/final_project","root","");
                        Statement statement = connection.createStatement();
                        statement.execute(String.format("INSERT INTO `countrytovisit` (`Id`, `Country`, `Date`) VALUES (NULL, '%s', '%s');", countryName, LocalDate.now()));
                        return;
                    } catch(Exception exc) { throw new Exception("couldn't add resource"); }
                }
            }
            throw new Exception("country does not exist");
        }catch(Exception exc) { throw new Exception(exc.getMessage()); }
    }

    /**
     * Method that removes country from the wishlist table repository.
     *
     * @param countryName country name.
     * @throws Exception if country is not in the repository table.
     */
    public void RemoveCountryFromWishlist(String countryName) throws Exception {
        try
        {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/final_project","root","");
            Statement statement = connection.createStatement();
            statement.executeQuery(String.format("DELETE FROM `countrytovisit` WHERE Country='%s';", countryName));
        }
        catch(Exception exc)
        {
            throw new Exception("couldn't remove resource");
        }
    }

    /**
     * Method that adds country to the visited table repository.
     *
     * @param countryName countries name.
     * @throws Exception if country doesn't exist or already added into the table.
     */
    public void AddCountryToVisited(String countryName) throws Exception {

        try {
            for (Country country: countriesAPI.getAllCountries().getCountries()) {
                if(countryName.equals(country.getName())){
                    try {
                        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/final_project","root","");
                        Statement statement = connection.createStatement();
                        statement.execute(String.format("INSERT INTO `countryvisited` (`Id`, `Country`, `Date`) VALUES (NULL, '%s', '%s');", countryName, LocalDate.now()));
                        return;
                    } catch(Exception exc) { throw new Exception("couldn't add resource"); }
                }
            }
            throw new Exception("country does not exist");
        }catch(Exception exc) { throw new Exception(exc.getMessage()); }
    }

    /**
     * Method that removes country from the visited table repository.
     *
     * @param countryName countries name.
     * @throws Exception if country is not in the repository table.
     */
    public void RemoveCountryFromVisited(String countryName) throws Exception {
        try
        {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/final_project","root","");
            Statement statement = connection.createStatement();
            statement.executeQuery(String.format("DELETE FROM `countryvisited` WHERE Country='%s';", countryName));
        }
        catch(Exception exc)
        {
            throw new Exception("couldn't remove resource");
        }
    }
}
