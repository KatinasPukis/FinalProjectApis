package lt.viko.eif.dziukas.FinalProjectApis.Model.COVID19Models;

import java.util.Date;

public class Response {
    public String continent;
    public String country;
    public int population;
    public Cases cases;
    public Deaths deaths;
    public Tests tests;
    public String day;
    public Date time; // galimai keist reikes po to date tipa i sql

    public Response() {

    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Cases getCases() {
        return cases;
    }

    public void setCases(Cases cases) {
        this.cases = cases;
    }

    public Deaths getDeaths() {
        return deaths;
    }

    public void setDeaths(Deaths deaths) {
        this.deaths = deaths;
    }

    public Tests getTests() {
        return tests;
    }

    public void setTests(Tests tests) {
        this.tests = tests;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

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
