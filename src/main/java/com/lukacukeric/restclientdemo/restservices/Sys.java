package com.lukacukeric.restclientdemo.restservices;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.math.BigInteger;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
class Sys {

    private BigInteger sunrise;
    private BigInteger sunset;

    public BigInteger getSunrise() {
        return sunrise;
    }

    public BigInteger getSunset() {
        return sunset;
    }
}
