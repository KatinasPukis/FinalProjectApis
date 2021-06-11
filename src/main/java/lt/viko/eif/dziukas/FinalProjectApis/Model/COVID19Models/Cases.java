package lt.viko.eif.dziukas.FinalProjectApis.Model.COVID19Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

/**
 * Represents Cases object that is a piece of
 * Statistics main Covid model
 * and it represents best new cases, active cases,
 * critical, recovered cases, etc. information
 *
 * @author Dainoras Ziukas, Valdemar Subotkovski, Dominykas Pleteras
 * @version 1.0
 * @since 1.0
 */

public class Cases {

    @SerializedName("new")
    public String newCases;
    public int active;
    public int critical;
    public int recovered;
    @SerializedName("1M_pop")
    public String _1M_pop;
    public int total;

    /**
     * Just an empty constructor.
     *
     */
    public Cases() { }

    /**
     * Gets countries covid cases
     *
     * @return the countries covid cases.
     */
    public String getNewCases() {
        return newCases;
    }

    /**
     * Sets the new countries covid cases
     *
     * @param newCases covid of the country
     */
    public void setNewCases(String newCases) {
        this.newCases = newCases;
    }

    /**
     * Gets countries active cases
     *
     * @return active countries covid cases
     */
    public int getActive() {
        return active;
    }

    /**
     * Sets active countries cases
     *
     * @param active covid cases of the country
     */
    public void setActive(int active) {
        this.active = active;
    }

    /**
     * Gets critical covid cases of the country
     *
     * @return critical covid cases of the country
     */
    public int getCritical() {
        return critical;
    }

    /**
     * Sets critical covid cases of the country
     *
     * @param critical covid cases of the country
     */
    public void setCritical(int critical) {
        this.critical = critical;
    }

    /**
     * Gets the recovered covid patients number
     *
     * @return recovered patients number
     */
    public int getRecovered() {
        return recovered;
    }

    /**
     * Sets the recovered covid patients number
     *
     * @param recovered patients number
     */
    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }

    /**
     * Gets covid cases by one milion people
     *
     * @return covid cases by one milion people
     */
    public String get_1M_pop() {
        return _1M_pop;
    }

    /**
     * Sets covid cases by one milion people
     *
     * @param _1M_pop covid cases by one milion people
     */
    public void set_1M_pop(String _1M_pop) {
        this._1M_pop = _1M_pop;
    }

    /**
     * Gets total information of covid cases
     *
     * @return total covid cases
     */
    public int getTotal() {
        return total;
    }

    /**
     * Sets total covid information cases
     *
     * @param total covid cases
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * To String method that formats cases
     * object parameters for printing.
     *
     * @return the string with cases information.
     */
    @Override
    public String toString() {
        return "Cases{" +
                "newCases='" + newCases + '\'' +
                ", active=" + active +
                ", critical=" + critical +
                ", recovered=" + recovered +
                ", _1M_pop='" + _1M_pop + '\'' +
                ", total=" + total +
                '}';
    }
}
