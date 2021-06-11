package lt.viko.eif.dziukas.FinalProjectApis.Model;

import lt.viko.eif.dziukas.FinalProjectApis.Model.RESTCountriesModels.Country;

import java.util.List;

public class ZonesModel {
    public List<Country> redZone;
    public List<Country> yellowZone;
    public List<Country> greenZone;

    public List<Country> getRedZone() {
        return redZone;
    }

    public void setRedZone(List<Country> redZone) {
        this.redZone = redZone;
    }

    public List<Country> getYellowZone() {
        return yellowZone;
    }

    public void setYellowZone(List<Country> yellowZone) {
        this.yellowZone = yellowZone;
    }

    public List<Country> getGreenZone() {
        return greenZone;
    }

    public void setGreenZone(List<Country> greenZone) {
        this.greenZone = greenZone;
    }

    @Override
    public String toString() {
        return "ZonesModel{" +
                "redZone=" + redZone +
                ", yellowZone=" + yellowZone +
                ", greenZone=" + greenZone +
                '}';
    }
}
