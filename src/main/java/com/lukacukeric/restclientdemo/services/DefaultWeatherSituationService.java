package com.lukacukeric.restclientdemo.services;

import com.lukacukeric.restclientdemo.restservices.WeatherSituationClient;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

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

    @Override
    public BigDecimal getFeelsLike(String cityName) {
        return client.getFeelsLike(cityName);
    }

    @Override
    public String getMainWeather(String cityName) {
        return client.getMainWeather(cityName);
    }

    @Override
    public String getWeatherDescription(String cityName) {
        return client.getWeatherDescription(cityName);
    }

    @Override
    public BigDecimal getWindSpeed(String cityName) {
        return client.getWindSpeed(cityName);
    }

    @Override
    public ZonedDateTime getSunrise(String cityName) {
        return parser(client.getSunrise(cityName));
    }

    @Override
    public ZonedDateTime getSunset(String cityName) {
        return parser(client.getSunset(cityName));
    }


    private ZonedDateTime parser(BigInteger data){
        return Instant.ofEpochSecond((data.longValue())).atZone(ZoneId.of("Europe/Brussels"));
    }
}
