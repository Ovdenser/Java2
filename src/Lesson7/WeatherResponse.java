package Lesson7;

public class WeatherResponse {

    @JsonProperty("DateTime")
    public String dateTime;
    @JsonProperty("EpochDateTime")
    public Integer epochDateTime;
    @JsonProperty("WeatherIcon")
    public Integer weatherIcon;
    @JsonProperty("IconPhrase")
    public String iconPhrase;
    @JsonProperty("HasPrecipitation")
    public Boolean hasPrecipitation;
    @JsonProperty("IsDayLight")
    public Boolean isDayLight;
    @JsonProperty("Temperature")
    public Temperature temperature;
    @JsonProperty("PrecipitationProbability")
    public Integer precipitationProbability;
    @JsonProperty("MobileLink")
    public String mobileLink;
    @JsonProperty("Link")
    public String link;

    @Override
    public  String toString() {
        return "Прогноз на " + dateTime + "ожидается " + iconPhrase + temperature.toString() + "\r\n";
    }
}
