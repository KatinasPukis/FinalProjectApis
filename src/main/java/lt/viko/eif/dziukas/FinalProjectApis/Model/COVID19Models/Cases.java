package lt.viko.eif.dziukas.FinalProjectApis.Model.COVID19Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cases {
    @JsonProperty("new")
    public String newCases;
    public int active;
    public int critical;
    public int recovered;
    @JsonProperty("1M_pop")
    public String _1M_pop;
    public int total;

    public Cases() {

    }

    public String getNewCases() {
        return newCases;
    }

    public void setNewCases(String newCases) {
        this.newCases = newCases;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public int getCritical() {
        return critical;
    }

    public void setCritical(int critical) {
        this.critical = critical;
    }

    public int getRecovered() {
        return recovered;
    }

    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }

    public String get_1M_pop() {
        return _1M_pop;
    }

    public void set_1M_pop(String _1M_pop) {
        this._1M_pop = _1M_pop;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

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
