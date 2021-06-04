package lt.viko.eif.dziukas.FinalProjectApis.Model.WeatherModel;

public class Weather {
    private double temp;
    private double temp_min;
    private double humidity;
    private double pressure;
    private double feels_like;
    private double temp_max;

    public Weather() {

    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(double temp_min) {
        this.temp_min = temp_min;
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

    public double getFeels_like() {
        return feels_like;
    }

    public void setFeels_like(double feels_like) {
        this.feels_like = feels_like;
    }

    public double getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(double temp_max) {
        this.temp_max = temp_max;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "temp=" + temp +
                ", temp_min=" + temp_min +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                ", feels_like=" + feels_like +
                ", temp_max=" + temp_max +
                '}';
    }
}
