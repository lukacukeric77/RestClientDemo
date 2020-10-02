package com.lukacukeric.restclientdemo.restservices;

import java.math.BigDecimal;

public interface WeatherSituationClient {

    BigDecimal getTemperature(String cityName);
//    String getFeelsLike(String cityName);
//    String getMainWeather(String cityName);
//    String getWeatherDescription(String cityName);
//    String getWindSpeed(String cityName);
}
