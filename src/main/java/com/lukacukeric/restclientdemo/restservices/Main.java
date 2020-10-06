package com.lukacukeric.restclientdemo.restservices;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
class Main {

    @JsonProperty("temp")
    private BigDecimal temperature;
    private BigDecimal feels_like;

    public BigDecimal getTemperature() {
        return temperature;
    }

    public BigDecimal getFeels_like() {
        return feels_like;
    }
}
