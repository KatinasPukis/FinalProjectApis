package lt.viko.eif.dziukas.FinalProjectApis.Model.COVID19Models;

import java.util.List;

/**
 * Represents Statistics object that is a piece of
 * CountryCovidHotelWeather main model
 * and it represents detailed covid information putted into
 * the response object list
 *
 * @author Dainoras Ziukas, Valdemar Subotkovski, Dominykas Pleteras
 * @version 1.0
 * @since 1.0
 */
public class Statistics {

    private List<Response> response;

    /**
     * Just an empty constructor.
     *
     */
    public Statistics() {

    }

    /**
     * Gets the list of the response object.
     *
     * @return the covid list.
     */
    public List<Response> getResponse() {
        return response;
    }

    /**
     * Sets the list of the response object.
     *
     * @param response of the response object list.
     */
    public void setResponse(List<Response> response) {
        this.response = response;
    }

    /**
     * To String method that formats root
     * object parameters for printing.
     *
     * @return the string with root information.
     */
    @Override
    public String toString() {
        return "Root{" +
                "response=" + response +
                '}';
    }

}
