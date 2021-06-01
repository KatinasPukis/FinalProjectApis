package lt.viko.eif.dziukas.FinalProjectApis.Model;

import org.springframework.hateoas.RepresentationModel;

import java.util.Arrays;
import java.util.List;

public class Country extends RepresentationModel<Country> {
    private String countryName;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                '}';
    }
}

