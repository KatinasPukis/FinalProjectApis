package lt.viko.eif.dziukas.FinalProjectApis;

import lt.viko.eif.dziukas.FinalProjectApis.Repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * Main class to start the spring application with
 * one single method.
 *
 * @author Dainoras Ziukas, Valdemar Subotkovski, Dominykas Pleteras
 * @version 1.0
 * @since 1.0
 */
@SpringBootApplication
@EnableOpenApi
public class main {

    /**
     * Method to start the spring application.
     *
     * @param args of string array.
     */
    public static void main(String[] args) {

        SpringApplication.run(main.class, args);
    }
}
