package ZipCodeDB;

public class WeatherObservation {
    private double humidity;
    private String windspeed;
    private String temperature;
    private String clouds;

    public WeatherObservation(double humidity, String windspeed, String temperature, String clouds) {
        this.humidity = humidity;
        this.windspeed = windspeed;
        this.temperature = temperature;
        this.clouds = clouds;
    }

    @Override
    public String toString() {
        return "WeatherObservation{" +
                "humidity=" + humidity +
                ", windspeed=" + windspeed +
                ", temperature=" + temperature +
                ", clouds='" + clouds + '\'' +
                '}';
    }
}
