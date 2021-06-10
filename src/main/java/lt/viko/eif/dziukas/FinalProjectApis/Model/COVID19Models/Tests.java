package lt.viko.eif.dziukas.FinalProjectApis.Model.COVID19Models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents Tests object that is a piece of
 * Statistics main Covid model
 * and it represents related information with tests.
 *
 * @author Dainoras Ziukas, Valdemar Subotkovski, Dominykas Pleteras
 * @version 1.0
 * @since 1.0
 */
public class Tests {

    @JsonProperty("1M_pop")
    public String _1M_pop;
    public int total;

    /**
     * Just an empty constructor.
     *
     */
    public Tests() {

    }

    /**
     * Gets tests information by 1 milion people.
     *
     * @return tests information by 1 milion people.
     */
    public String get_1M_pop() {
        return _1M_pop;
    }

    /**
     * Sets tests information by 1 milion people.
     *
     * @param _1M_pop tests information by 1 milion people.
     */
    public void set_1M_pop(String _1M_pop) {
        this._1M_pop = _1M_pop;
    }

    /**
     * Gets total information related with tests.
     *
     * @return total tests done.
     */
    public int getTotal() {
        return total;
    }

    /**
     * Sets total information related with tests.
     *
     * @param total tests info.
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * To String method that formats tests
     * object parameters for printing.
     *
     * @return the string with tests information.
     */
    @Override
    public String toString() {
        return "Tests{" +
                "_1M_pop='" + _1M_pop + '\'' +
                ", total=" + total +
                '}';
    }
}
