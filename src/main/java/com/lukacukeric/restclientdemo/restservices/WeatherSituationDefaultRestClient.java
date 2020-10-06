package com.lukacukeric.restclientdemo.restservices;

import com.lukacukeric.restclientdemo.exceptions.CannotReadWeatherException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.math.BigInteger;


@Component
public class WeatherSituationDefaultRestClient implements WeatherSituationClient {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private final String uri;
    private final RestTemplate restTemplate;

    public WeatherSituationDefaultRestClient(@Value("${openWeatherMapURL}") String uri, RestTemplateBuilder builder) {
        this.uri = uri;
        this.restTemplate = builder.build();
    }

    @Override
    public BigDecimal getTemperature(String cityName) {
        try {
            return restTemplate.getForObject(uri, WeatherSituation.class, cityName).getMain().getTemperature();

        } catch (Exception exception) {
            logger.error("Cannot retrieve temperature", exception);
            throw new CannotReadWeatherException();
        }
    }

    @Override
    public BigDecimal getFeelsLike(String cityName) {
        try{
            return restTemplate.getForObject(uri, WeatherSituation.class, cityName).getMain().getFeels_like();
        } catch (Exception exception){
            logger.error("Cannot retrieve feels like temperature", exception);
            throw new CannotReadWeatherException();
        }
    }

    @Override
    public String getMainWeather(String cityName) {
        try{
            return restTemplate.getForObject(uri, WeatherSituation.class, cityName).getWeather().get(0).getMain();
        } catch (Exception e){
            logger.error("Cannot retrieve main weather", e);
            throw new CannotReadWeatherException();
        }
    }

    @Override
    public String getWeatherDescription(String cityName) {
        try {
            return restTemplate.getForObject(uri, WeatherSituation.class, cityName).getWeather().get(0).getDescription();
        } catch (Exception e){
            logger.error("Cannot retrieve weather description", e);
            throw new CannotReadWeatherException();
        }
    }

    @Override
    public BigDecimal getWindSpeed(String cityName) {
        try{
            return restTemplate.getForObject(uri, WeatherSituation.class, cityName).getWind().getSpeed();
        } catch (Exception e){
            logger.error("Cannot retrieve wind speed", e);
            throw new CannotReadWeatherException();
        }
    }

    @Override
    public BigInteger getSunrise(String cityName) {
        try {
            return restTemplate.getForObject(uri, WeatherSituation.class, cityName).getSys().getSunrise();
        } catch (Exception e){
            logger.error("Cannot retrieve sunrise time", e);
            throw new CannotReadWeatherException();
        }
    }

    @Override
    public BigInteger getSunset(String cityName) {
        try{
            return restTemplate.getForObject(uri, WeatherSituation.class, cityName).getSys().getSunset();
        } catch (Exception e){
            logger.error("Cannot retrieve sunset time", e);
            throw new CannotReadWeatherException();
        }
    }
}
