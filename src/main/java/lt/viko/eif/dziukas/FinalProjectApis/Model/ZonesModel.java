package lt.viko.eif.dziukas.FinalProjectApis.Model;

import lt.viko.eif.dziukas.FinalProjectApis.Model.RESTCountriesModels.Country;

import java.util.List;

/**
 * Represents Zones Model object it
 * includes lists of countries in red, yellow and green zones.
 *
 * @author Dainoras Ziukas, Valdemar Subotkovski, Dominykas Pleteras
 * @version 1.0
 * @since 1.0
 */
public class ZonesModel {
    public List<Country> redZone;
    public List<Country> yellowZone;
    public List<Country> greenZone;

    /**
     * Returns list of countries in red zone.
     *
     * @return list of countries in red zone.
     */
    public List<Country> getRedZone() {
        return redZone;
    }

    /**
     * Sets list of countries in red zone.
     *
     * @param redZone list.
     */
    public void setRedZone(List<Country> redZone) {
        this.redZone = redZone;
    }

    /**
     * Returns list of countries in yellow zone.
     *
     * @return list of countries in yellow zone.
     */
    public List<Country> getYellowZone() {
        return yellowZone;
    }

    /**
     * Sets list of countries in yellow zone.
     *
     * @param yellowZone list.
     */
    public void setYellowZone(List<Country> yellowZone) {
        this.yellowZone = yellowZone;
    }

    /**
     * Returns list of countries in green zone.
     *
     * @return list of countries in green zone.
     */
    public List<Country> getGreenZone() {
        return greenZone;
    }

    /**
     * Sets list of countries in green zone.
     *
     * @param greenZone list.
     */
    public void setGreenZone(List<Country> greenZone) {
        this.greenZone = greenZone;
    }

    /**
     * To String method that formats Zones
     * object parameters for printing.
     *
     * @return the string with Zones information.
     */
    @Override
    public String toString() {
        return "ZonesModel{" +
                "redZone=" + redZone +
                ", yellowZone=" + yellowZone +
                ", greenZone=" + greenZone +
                '}';
    }
}
