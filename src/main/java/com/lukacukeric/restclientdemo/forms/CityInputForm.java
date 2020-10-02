package com.lukacukeric.restclientdemo.forms;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class CityInputForm {

    @NotEmpty(message = "this must not be empty")
    private final String cityName;

    public CityInputForm(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

}
