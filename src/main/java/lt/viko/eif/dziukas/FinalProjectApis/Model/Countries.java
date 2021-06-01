package lt.viko.eif.dziukas.FinalProjectApis.Model;

import lt.viko.eif.dziukas.FinalProjectApis.Model.RESTCountriesModels.Country;

import java.util.List;
// NEBAIGTA GALIMA KEIST
public class Countries {
    private List<Country> countries;

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    @Override
    public String toString() {
        return "Countries{" +
                "countries=" + countries +
                '}';
    }
}
