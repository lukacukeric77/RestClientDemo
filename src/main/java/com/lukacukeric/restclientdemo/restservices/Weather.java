package com.lukacukeric.restclientdemo.restservices;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
class Weather {

    private String main;
    private String description;

    public String getMain() {
        return main;
    }

    public String getDescription() {
        return description;
    }
}
