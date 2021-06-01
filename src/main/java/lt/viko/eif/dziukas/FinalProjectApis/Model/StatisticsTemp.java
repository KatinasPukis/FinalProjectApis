package lt.viko.eif.dziukas.FinalProjectApis.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class StatisticsTemp {

    private String country;

    @JsonProperty("cases")
    private List<CasesTemp> casesTempList = new ArrayList<>();

    public StatisticsTemp(){

    }

    public List<CasesTemp> getCasesList() {
        return casesTempList;
    }

    public void setCasesList(List<CasesTemp> casesTempList) {
        this.casesTempList = casesTempList;
    }
}
