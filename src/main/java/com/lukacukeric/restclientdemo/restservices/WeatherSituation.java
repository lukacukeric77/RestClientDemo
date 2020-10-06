package com.lukacukeric.restclientdemo.restservices;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.ArrayList;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class WeatherSituation {

    private Main main;
    private Wind wind;
    private ArrayList<Weather> weather;

    public Main getMain() {
        return main;
    }

    public Wind getWind() {
        return wind;
    }

    public ArrayList<Weather> getWeather() {
        return weather;
    }
}
