package lt.viko.eif.dziukas.FinalProjectApis.Model.COVID19Models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.google.gson.annotations.SerializedName;

import java.util.Date;
/**
 * Represents WorldStats object that is a separate
 * object from other covid models. It represents
 * world active cases, new cases, new deaths and etc.
 * information.
 *
 * @author Dainoras Ziukas, Valdemar Subotkovski, Dominykas Pleteras
 * @version 1.0
 * @since 1.0
 */
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

    /**
     * Just an empty constructor.
     *
     */
    public WorldStats() {

    }

    /**
     * Gets active covid cases information.
     *
     * @return active covid cases information.
     */
    public String getActiveCases() {
        return activeCases;
    }

    /**
     * Sets active covid cases information.
     *
     * @param activeCases of the covid cases.
     */
    public void setActiveCases(String activeCases) {
        this.activeCases = activeCases;
    }

    /**
     * Gets country name (here is just - world).
     *
     * @return country name (world).
     */
    public String getName() {
        return name;
    }

    /**
     * Sets countries name.
     *
     * @param name of the country.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets last update.
     *
     * @return last update.
     */
    public String getLastUpdate() {
        return lastUpdate;
    }

    /**
     * Sets last update.
     *
     * @param lastUpdate of the covid situation.
     */
    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    /**
     * Gets new cases of the country.
     *
     * @return new cases.
     */
    public String getNewCases() {
        return newCases;
    }

    /**
     * Set new cases of the country.
     *
     * @param newCases of the country.
     */
    public void setNewCases(String newCases) {
        this.newCases = newCases;
    }

    /**
     * Gets new deaths of the country.
     *
     * @return new deaths of the country.
     */
    public String getNewDeaths() {
        return newDeaths;
    }

    /**
     * Sets new deaths of the country.
     *
     * @param newDeaths of the country.
     */
    public void setNewDeaths(String newDeaths) {
        this.newDeaths = newDeaths;
    }

    /**
     * Gets total cases of the country.
     *
     * @return total cases.
     */
    public String getTotalCases() {
        return totalCases;
    }

    /**
     * Sets total cases of the country.
     *
     * @param totalCases of the country.
     */
    public void setTotalCases(String totalCases) {
        this.totalCases = totalCases;
    }

    /**
     * Gets all recovered covid patients information.
     *
     * @return recovered covid patients information.
     */
    public String getTotalRecovered_text() {
        return TotalRecovered_text;
    }

    /**
     * Sets all recovered covid patients information.
     *
     * @param totalRecovered_text recovered covid patients information.
     */
    public void setTotalRecovered_text(String totalRecovered_text) {
        TotalRecovered_text = totalRecovered_text;
    }

    /**
     * Gets total deaths of covid.
     *
     * @return total deaths of covid.
     */
    public String getTotalDeaths() {
        return totalDeaths;
    }

    /**
     * Sets total deaths of covid.
     *
     * @param totalDeaths of covid.
     */
    public void setTotalDeaths(String totalDeaths) {
        this.totalDeaths = totalDeaths;
    }

    @Override
    public String toString() {
        return "WorldStats{" +
                "activeCases='" + activeCases + '\'' +
                ", name='" + name + '\'' +
                ", lastUpdate='" + lastUpdate + '\'' +
                ", newCases='" + newCases + '\'' +
                ", newDeaths='" + newDeaths + '\'' +
                ", totalCases='" + totalCases + '\'' +
                ", totalDeaths='" + totalDeaths + '\'' +
                ", TotalRecovered_text='" + TotalRecovered_text + '\'' +
                '}';
    }
}
