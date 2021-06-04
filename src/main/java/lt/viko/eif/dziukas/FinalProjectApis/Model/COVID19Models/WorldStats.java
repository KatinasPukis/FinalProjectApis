package lt.viko.eif.dziukas.FinalProjectApis.Model.COVID19Models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.Date;

public class WorldStats {
    private String activeCases;
    private String name;
    private String lastUpdate;
    private String newCases;
    private String newDeaths;
    private String totalCases;
    private String totalDeaths;
    private String TotalRecovered_text;

    public WorldStats() {

    }

    @JsonGetter("Active Cases_text")
    public String getActiveCases() {
        return activeCases;
    }

    @JsonSetter("activesCases")
    public void setActiveCases(String activeCases) {
        this.activeCases = activeCases;
    }

    @JsonGetter("Country_text")
    public String getName() {
        return name;
    }

    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonGetter("Active Cases_text")
    public String getLastUpdate() {
        return lastUpdate;
    }

    @JsonSetter("activesCases")
    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @JsonGetter("Active Cases_text")
    public String getNewCases() {
        return newCases;
    }

    @JsonSetter("activesCases")
    public void setNewCases(String newCases) {
        this.newCases = newCases;
    }

    @JsonGetter("Active Cases_text")
    public String getNewDeaths() {
        return newDeaths;
    }

    @JsonSetter("activesCases")
    public void setNewDeaths(String newDeaths) {
        this.newDeaths = newDeaths;
    }

    @JsonGetter("Active Cases_text")
    public String getTotalCases() {
        return totalCases;
    }

    @JsonSetter("activesCases")
    public void setTotalCases(String totalCases) {
        this.totalCases = totalCases;
    }

    @JsonGetter("Active Cases_text")
    public String getTotalRecovered_text() {
        return TotalRecovered_text;
    }

    @JsonSetter("activesCases")
    public void setTotalRecovered_text(String totalRecovered_text) {
        TotalRecovered_text = totalRecovered_text;
    }

    @JsonGetter("Active Cases_text")
    public String getTotalDeaths() {
        return totalDeaths;
    }

    @JsonSetter("activesCases")
    public void setTotalDeaths(String totalDeaths) {
        this.totalDeaths = totalDeaths;
    }
}
