package lt.viko.eif.dziukas.FinalProjectApis.Model.COVID19Models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class WorldStats {
    @SerializedName("Active Cases_text")
    private String activeCases;
    @SerializedName("Country_text")
    private String name;
    @SerializedName("Last Update")
    private String lastUpdate;
    @SerializedName("New Cases_text")
    private String newCases;
    @SerializedName("New Deaths_text")
    private String newDeaths;
    @SerializedName("Total Cases_text")
    private String totalCases;
    @SerializedName("Total Deaths_text")
    private String totalDeaths;
    @SerializedName("Total Recovered_text")
    private String TotalRecovered_text;

    public WorldStats() {

    }

    public String getActiveCases() {
        return activeCases;
    }

    public void setActiveCases(String activeCases) {
        this.activeCases = activeCases;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getNewCases() {
        return newCases;
    }

    public void setNewCases(String newCases) {
        this.newCases = newCases;
    }

    public String getNewDeaths() {
        return newDeaths;
    }

    public void setNewDeaths(String newDeaths) {
        this.newDeaths = newDeaths;
    }

    public String getTotalCases() {
        return totalCases;
    }

    public void setTotalCases(String totalCases) {
        this.totalCases = totalCases;
    }

    public String getTotalRecovered_text() {
        return TotalRecovered_text;
    }

    public void setTotalRecovered_text(String totalRecovered_text) {
        TotalRecovered_text = totalRecovered_text;
    }

    public String getTotalDeaths() {
        return totalDeaths;
    }

    public void setTotalDeaths(String totalDeaths) {
        this.totalDeaths = totalDeaths;
    }
}
