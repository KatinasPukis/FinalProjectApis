package lt.viko.eif.dziukas.FinalProjectApis.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.json.JSONPropertyIgnore;

import java.util.ArrayList;
import java.util.List;

public class Statistics {

    private String country;

    @JsonProperty("cases")
    private List<Cases> casesList = new ArrayList<>();

    public Statistics(){

    }

    public List<Cases> getCasesList() {
        return casesList;
    }

    public void setCasesList(List<Cases> casesList) {
        this.casesList = casesList;
    }
}
