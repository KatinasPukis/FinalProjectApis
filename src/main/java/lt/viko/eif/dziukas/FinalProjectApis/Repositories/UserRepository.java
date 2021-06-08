package lt.viko.eif.dziukas.FinalProjectApis.Repositories;

import java.sql.*;

public class UserRepository {

    public  void GetCountryesVisited() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/final_project","root",""); //prisijungimas pr duombazes

        Statement statement = connection.createStatement(); //statment per kuri query sauni

        ResultSet resultSet = statement.executeQuery("select * from countryvisited"); // cia rasai sql komandas

        while (resultSet.next()){
            System.out.println((resultSet.getString("Country"))); // cia grazina koki nr collum pagal varda
        }
    }
    public  void GetCountryesToVisit() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/final_project","root","");

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from countrytovisit");

        while (resultSet.next()){
            System.out.println((resultSet.getString("Country")));
        }
    }



}
