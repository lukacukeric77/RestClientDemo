package com.lukacukeric.restclientdemo.services;

import com.lukacukeric.restclientdemo.restservices.WeatherSituationClient;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
class DefaultWeatherSituationService implements WeatherSituationServices{

private final WeatherSituationClient client;

    public DefaultWeatherSituationService(WeatherSituationClient client) {
        this.client = client;
    }

    @Override
    public BigDecimal getTemperature(String cityName) {
       return client.getTemperature(cityName);
    }

//    @Override
//    public String getFeelsLike(String cityName) {
//        return null;
//    }
//
//    @Override
//    public String getMainWeather(String cityName) {
//        return null;
//    }
//
//    @Override
//    public String getWeatherDescription(String cityName) {
//        return null;
//    }
//
//    @Override
//    public String getWindSpeed(String cityName) {
//        return null;
//    }
}
