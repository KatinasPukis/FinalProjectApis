package lt.viko.eif.dziukas.FinalProjectApis.Model.COVID19Models;

import java.util.Date;

/**
 * Represents Response object that is a piece of
 * Statistics main Covid model
 * and it represents countries continent information, countries name,
 * countries population, covid cases, deaths, tests, etc.
 *
 * @author Dainoras Ziukas, Valdemar Subotkovski, Dominykas Pleteras
 * @version 1.0
 * @since 1.0
 */
public class Response {

    public String continent;
    public String country;
    public int population;
    public Cases cases;
    public Deaths deaths;
    public Tests tests;
    public String day;
    public Date time; // galimai keist reikes po to date tipa i sql

    /**
     * Just an empty constructor.
     *
     */
    public Response() {

    }

    /**
     * Gets countries continent.
     *
     * @return countries continent.
     */
    public String getContinent() {
        return continent;
    }

    /**
     * Sets countries continent.
     *
     * @param continent of the country.
     */
    public void setContinent(String continent) {
        this.continent = continent;
    }

    /**
     * Gets countries name.
     *
     * @return country by name.
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets countries name.
     *
     * @param country name.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Gets countries population.
     *
     * @return countries population.
     */
    public int getPopulation() {
        return population;
    }

    /**
     * Sets countries population.
     *
     * @param population of the country.
     */
    public void setPopulation(int population) {
        this.population = population;
    }

    /**
     * Gets countries covid cases.
     *
     * @return countries covid cases.
     */
    public Cases getCases() {
        return cases;
    }

    /**
     * Sets countries covid cases.
     *
     * @param cases covid of the country.
     */
    public void setCases(Cases cases) {
        this.cases = cases;
    }

    /**
     * Gets countries patients death stats from covid.
     *
     * @return countries patients deaths stats from covid.
     */
    public Deaths getDeaths() { return deaths; }

    /**
     * Sets countries patients death stats from covid.
     *
     * @param deaths of covid by country.
     */
    public void setDeaths(Deaths deaths) {
        this.deaths = deaths;
    }

    /**
     * Gets countries tests information.
     *
     * @return tests information.
     */
    public Tests getTests() {
        return tests;
    }

    /**
     * Sets covid tests information.
     *
     * @param tests of covid.
     */
    public void setTests(Tests tests) {
        this.tests = tests;
    }

    /**
     * Gets day.
     * @return day.
     */
    public String getDay() {
        return day;
    }

    /**
     * Sets day.
     * @param day of info.
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * Gets time.
     * @return time.
     */
    public Date getTime() {
        return time;
    }

    /**
     * Sets time
     * @param time of info.
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * To String method that formats response
     * object parameters for printing.
     *
     * @return the string with response information.
     */
    @Override
    public String toString() {
        return "Response{" +
                "continent='" + continent + '\'' +
                ", country='" + country + '\'' +
                ", population=" + population +
                ", cases=" + cases +
                ", deaths=" + deaths +
                ", tests=" + tests +
                ", day='" + day + '\'' +
                ", time=" + time +
                '}';
    }
}
