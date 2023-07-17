package cucumber.model;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class WeatherResponse {
    private double lat;
    private double lon;
    private String timezone;

    @JsonProperty("timezone_offset")           //2.anotacija chast jackson, sledujuwaja peremennaja vot takoje nazvanije, linkujet
    private String timezoneOffset;                //1.nazvanije s _ neljzja v java

    private Current current;                   //vibirajem Current -model, vkladivajem objekt
    private List<Minute> minutely;             //spisok i nashi objekti vnutri i nazvanije spiska
    private List<Hour> hourly;
    private List<Day> daily;
    private List<Alert> alerts;

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getTimezoneOffset() {
        return timezoneOffset;
    }

    public void setTimezoneOffset(String timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    public List<Minute> getMinutely() {
        return minutely;
    }

    public void setMinutely(List<Minute> minutely) {
        this.minutely = minutely;
    }

    public List<Hour> getHourly() {
        return hourly;
    }

    public void setHourly(List<Hour> hourly) {
        this.hourly = hourly;
    }

    public List<Day> getDaily() {
        return daily;
    }

    public void setDaily(List<Day> daily) {
        this.daily = daily;
    }

    public List<Alert> getAlerts() {
        return alerts;
    }

    public void setAlerts(List<Alert> alerts) {
        this.alerts = alerts;
    }
}
