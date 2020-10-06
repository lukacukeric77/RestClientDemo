package com.lukacukeric.restclientdemo.domain;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

public class CurrentWeather {

    private BigDecimal temperature;
    private BigDecimal feels_like;
    private BigDecimal wind;
    private String mainWeather;
    private String description;
    private ZonedDateTime sunrise;
    private ZonedDateTime sunset;


    public CurrentWeather(BigDecimal temperature, BigDecimal feels_like,
                          BigDecimal wind, String mainWeather, String description,
                          ZonedDateTime sunrise, ZonedDateTime sunset) {
        this.temperature = temperature;
        this.feels_like = feels_like;
        this.wind = wind;
        this.mainWeather = mainWeather;
        this.description = description;
        this.sunrise = sunrise;
        this.sunset = sunset;
    }

    public BigDecimal getTemperature() {
        return temperature;
    }

    public BigDecimal getFeels_like() {
        return feels_like;
    }

    public BigDecimal getWind() {
        return wind;
    }

    public String getMainWeather() {
        return mainWeather;
    }

    public String getDescription() {
        return description;
    }

    public ZonedDateTime getSunrise() {
        return sunrise;
    }

    public ZonedDateTime getSunset() {
        return sunset;
    }
}
