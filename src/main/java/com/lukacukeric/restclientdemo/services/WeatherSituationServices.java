package com.lukacukeric.restclientdemo.services;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

public interface WeatherSituationServices {

    BigDecimal getTemperature(String cityName);
    BigDecimal getFeelsLike(String cityName);
    String getMainWeather(String cityName);
    String getWeatherDescription(String cityName);
    BigDecimal getWindSpeed(String cityName);
    ZonedDateTime getSunrise(String cityName);
    ZonedDateTime getSunset(String cityName);

}
