package lt.viko.eif.dziukas.FinalProjectApis.Model.WeatherModel;

import com.google.gson.annotations.SerializedName;

/**
 * Represents Weather object that is a piece of
 * CountryCovidHotelWeather main model
 * and it represents weather information of
 * the city.
 *
 * @author Dainoras Ziukas, Valdemar Subotkovski, Dominykas Pleteras
 * @version 1.0
 * @since 1.0
 */
public class Weather {

    private double temp;
    @SerializedName("temp_min")
    private double tempMin;
    private double humidity;
    private double pressure;
    @SerializedName("feels_like")
    private double feelsLike;
    @SerializedName("temp_max")
    private double tempMax;

    /**
     * Just an empty constructor.
     *
     */
    public Weather() {

    }

    /**
     * Gets cities temperature.
     *
     * @return cities temperature.
     */
    public double getTemp() {
        return temp;
    }

    /**
     * Sets cities temperature.
     *
     * @param temp of the temperature.
     */
    public void setTemp(double temp) {
        this.temp = temp;
    }

    /**
     * Gets minimum temperature of the city.
     *
     * @return minimum temperature of the city.
     */
    public double getTempMin() {
        return tempMin;
    }

    /**
     * Sets minimum temperature of the city.
     *
     * @param tempMin of the city.
     */
    public void setTempMin(double tempMin) {
        this.tempMin = tempMin;
    }

    /**
     * Gets cities humidity levels.
     *
     * @return cities humidity levels.
     */
    public double getHumidity() {
        return humidity;
    }

    /**
     * Sets cities humidity levels.
     *
     * @param humidity levels of the city.
     */
    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    /**
     * Gets cities pressure levels.
     *
     * @return pressure levels of the city.
     */
    public double getPressure() {
        return pressure;
    }

    /**
     * Sets cities pressure levels.
     *
     * @param pressure levels of the city.
     */
    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    /**
     * Gets ,,Feels like" temperature.
     *
     * @return ,,Feels like" temperature.
     */
    public double getFeelsLike() {
        return feelsLike;
    }

    /**
     * Sets ,,Feels like" temperature".
     *
     * @param feelsLike temperature of the city.
     */
    public void setFeelsLike(double feelsLike) {
        this.feelsLike = feelsLike;
    }

    /**
     * Gets maximum temperature of the city.
     *
     * @return maximum temperature of the city.
     */
    public double getTempMax() {
        return tempMax;
    }

    /**
     * Sets maximum temperature of the city.
     *
     * @param tempMax of the city.
     */
    public void setTempMax(double tempMax) {
        this.tempMax = tempMax;
    }

    /**
     * To String method that formats weather
     * object parameters for printing.
     *
     * @return the string with weather information.
     */
    @Override
    public String toString() {
        return "Weather{" +
                "temp=" + temp +
                ", tempMin=" + tempMin +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                ", feelsLike=" + feelsLike +
                ", tempMax=" + tempMax +
                '}';
    }
}
