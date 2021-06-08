package lt.viko.eif.dziukas.FinalProjectApis.Repositories;

import lt.viko.eif.dziukas.FinalProjectApis.APIs.RESTCountries;
import lt.viko.eif.dziukas.FinalProjectApis.Model.RESTCountriesModels.Countries;
import lt.viko.eif.dziukas.FinalProjectApis.Model.RESTCountriesModels.Country;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private static RESTCountries countriesAPI = new RESTCountries();

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

    public void AddCountryToWishlist(String countryName) throws Exception {
        try
        {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/final_project","root","");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("INSERT INTO `countrytovisit` (`Id`, `Country`, `Date`) VALUES (NULL, 'Lithuania', '2021-06-09');");
        }
        catch(Exception exc)
        {
            throw new Exception(exc.getMessage());
        }
    }

    public void RemoveCountryFromWishlist()
    {

    }

    public void AddCountryToVisited()
    {

    }

    public void RemoveCountryFromVisited()
    {

    }
}
