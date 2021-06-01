package lt.viko.eif.dziukas.FinalProjectApis.Model.RESTCountriesModels;

import java.util.List;

public class Countries {
    private List<Country> Countries;

    public Countries() {

    }

    public List<Country> getCountries() {
        return Countries;
    }

    public void setCountries(List<Country> Countries) {
        this.Countries = Countries;
    }

    @Override
    public String toString() {
        return "Countries{" +
                "countries=" + Countries +
                '}';
    }
}
