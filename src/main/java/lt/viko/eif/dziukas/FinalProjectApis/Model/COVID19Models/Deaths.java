package lt.viko.eif.dziukas.FinalProjectApis.Model.COVID19Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

/**
 * Represents Deaths object that is a piece of
 * Statistics main Covid model
 * and it represents best new deaths, total deaths
 * information.
 *
 * @author Dainoras Ziukas, Valdemar Subotkovski, Dominykas Pleteras
 * @version 1.0
 * @since 1.0
 */
public class Deaths {

        @SerializedName("new")
        public String newDeaths;
        @SerializedName("1M_pop")
        public String _1M_pop;
        public int total;

        /**
         * Just an empty constructor.
         *
         */
        public Deaths() { }

        /**
         * Gets the new covid deaths information.
         *
         * @return covid deaths information.
         */
        public String getNewDeaths() {
                return newDeaths;
        }

        /**
         * Sets the new covid deaths information.
         *
         * @param newDeaths covid information.
         */
        public void setNewDeaths(String newDeaths) {
                this.newDeaths = newDeaths;
        }

        /**
         * Gets deaths by 1 milion people.
         *
         * @return deaths by 1 milion people
         */
        public String get_1M_pop() {
                return _1M_pop;
        }

        /**
         * Sets deaths by 1 milion people
         *
         * @param _1M_pop deaths by 1 milion people
         */
        public void set_1M_pop(String _1M_pop) {
                this._1M_pop = _1M_pop;
        }

        /**
         * Gets total information of covid deaths
         *
         * @return total covid deaths information
         */
        public int getTotal() {
                return total;
        }

        /**
         * Set total information of covid deaths
         *
         * @param total covid deaths information
         */
        public void setTotal(int total) {
                this.total = total;
        }

        /**
         * To String method that formats deaths
         * object parameters for printing.
         *
         * @return the string with deaths information.
         */
        @Override
        public String toString() {
                return "Deaths{" +
                        "newDeaths='" + newDeaths + '\'' +
                        ", _1M_pop='" + _1M_pop + '\'' +
                        ", total=" + total +
                        '}';
        }
}


