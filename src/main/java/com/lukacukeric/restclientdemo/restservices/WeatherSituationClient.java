package com.lukacukeric.restclientdemo.restservices;

import java.math.BigDecimal;
import java.math.BigInteger;

public interface WeatherSituationClient {

    BigDecimal getTemperature(String cityName);
    BigDecimal getFeelsLike(String cityName);
    String getMainWeather(String cityName);
    String getWeatherDescription(String cityName);
    BigDecimal getWindSpeed(String cityName);
    BigInteger getSunrise(String cityName);
    BigInteger getSunset(String cityName);
}
