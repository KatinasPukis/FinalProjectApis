package lt.viko.eif.dziukas.FinalProjectApis;

import lt.viko.eif.dziukas.FinalProjectApis.Repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@EnableOpenApi
public class main {
    public static void main(String[] args) {

        SpringApplication.run(main.class, args);
    }
}
