package lt.viko.eif.dziukas.FinalProjectApis.Model.COVID19Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tests {
    @JsonProperty("1M_pop")
    public String _1M_pop;
    public int total;

    public Tests() {

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
        return "Tests{" +
                "_1M_pop='" + _1M_pop + '\'' +
                ", total=" + total +
                '}';
    }
}
