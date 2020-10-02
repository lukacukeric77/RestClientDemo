package com.lukacukeric.restclientdemo.restservices;

import com.lukacukeric.restclientdemo.exceptions.CannotReadTemperatureException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;


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
            throw new CannotReadTemperatureException();
        }
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
