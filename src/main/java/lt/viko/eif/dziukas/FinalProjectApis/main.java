package lt.viko.eif.dziukas.FinalProjectApis;


import lt.viko.eif.dziukas.FinalProjectApis.APIs.BestCapitalHotel;
import lt.viko.eif.dziukas.FinalProjectApis.APIs.COVID19;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class main {
    public static void main(String[] args) {
        BestCapitalHotel bestCapitalHotel = new BestCapitalHotel(); // tikrinam
        bestCapitalHotel.getBestHotelInTheCapital(); // tikrinam
        SpringApplication.run(main.class, args);
        }
    }
