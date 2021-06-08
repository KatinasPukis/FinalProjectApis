package lt.viko.eif.dziukas.FinalProjectApis.Model.WeatherModel;

import com.google.gson.annotations.SerializedName;

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

    public Weather() {

    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getTempMin() {
        return tempMin;
    }

    public void setTempMin(double tempMin) {
        this.tempMin = tempMin;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(double feelsLike) {
        this.feelsLike = feelsLike;
    }

    public double getTempMax() {
        return tempMax;
    }

    public void setTempMax(double tempMax) {
        this.tempMax = tempMax;
    }

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
