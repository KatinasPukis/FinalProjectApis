package lt.viko.eif.dziukas.FinalProjectApis.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CasesTemp {

    @JsonProperty("new")
    private String new_cases;

    @JsonProperty("recovered")
    private Integer recovered;

    @JsonProperty("total")
    private Integer total;

    @JsonProperty("critical")
    private Integer critical;

    public CasesTemp(){

    }

    public String getNew_cases() {
        return new_cases;
    }

    public void setNew_cases(String new_cases) {
        this.new_cases = new_cases;
    }

    public Integer getRecovered() {
        return recovered;
    }

    public void setRecovered(Integer recovered) {
        this.recovered = recovered;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getCritical() {
        return critical;
    }

    public void setCritical(Integer critical) {
        this.critical = critical;
    }
}
