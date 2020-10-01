package com.lukacukeric.restclientdemo.forms;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class CityInputForm {

    @NotEmpty(message = "this must not be empty")
    private final String cityName;
    @NotNull(message = "this must not be empty")
    @Positive(message = "country code must be positive number")
    private final Long countryCode;

    public CityInputForm(String cityName, Long countryCode) {
        this.cityName = cityName;
        this.countryCode = countryCode;
    }

    public String getCityName() {
        return cityName;
    }

    public Long getCountryCode() {
        return countryCode;
    }
}
