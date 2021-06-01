package lt.viko.eif.dziukas.FinalProjectApis.Model;

import org.springframework.hateoas.RepresentationModel;

public class CountryTemp extends RepresentationModel<CountryTemp> {
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

