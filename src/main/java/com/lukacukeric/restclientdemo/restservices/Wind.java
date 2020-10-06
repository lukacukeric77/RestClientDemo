package com.lukacukeric.restclientdemo.restservices;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.math.BigDecimal;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
class Wind {

    private BigDecimal speed;

    public BigDecimal getSpeed() {
        return speed;
    }
}
