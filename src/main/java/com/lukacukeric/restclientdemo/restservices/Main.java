package com.lukacukeric.restclientdemo.restservices;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
class Main {

    @JsonProperty("temp")
   private BigDecimal temperature;

    public BigDecimal getTemperature() {
        return temperature;
    }
}
