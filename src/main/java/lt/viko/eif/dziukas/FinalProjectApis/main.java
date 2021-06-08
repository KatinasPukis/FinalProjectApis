package lt.viko.eif.dziukas.FinalProjectApis;


import lt.viko.eif.dziukas.FinalProjectApis.APIs.BestCapitalHotel;
import lt.viko.eif.dziukas.FinalProjectApis.APIs.COVID19;
import lt.viko.eif.dziukas.FinalProjectApis.APIs.RESTCountries;
import lt.viko.eif.dziukas.FinalProjectApis.Repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class main {
    public static void main(String[] args) {
       //BestCapitalHotel bestCapitalHotel = new BestCapitalHotel(); // tikrinam
       // bestCapitalHotel.getBestHotelInTheCapital(); // tikrinam
        //RESTCountries restCountries = new RESTCountries();
        //restCountries.getAllCountries();
        SpringApplication.run(main.class, args);
        UserRepository userRepository = new UserRepository(); //cia yra duombazes testas veliau trinti
        try {
            userRepository.GetCountryesToVisit();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    }
