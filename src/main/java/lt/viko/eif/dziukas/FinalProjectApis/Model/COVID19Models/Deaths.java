package lt.viko.eif.dziukas.FinalProjectApis.Model.COVID19Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Deaths {
        @JsonProperty("new")
        public String newDeaths;
        @JsonProperty("1M_pop")
        public String _1M_pop;
        public int total;

        public Deaths() {

        }

        public String getNewDeaths() {
                return newDeaths;
        }

        public void setNewDeaths(String newDeaths) {
                this.newDeaths = newDeaths;
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
                return "Deaths{" +
                        "newDeaths='" + newDeaths + '\'' +
                        ", _1M_pop='" + _1M_pop + '\'' +
                        ", total=" + total +
                        '}';
        }
}


