package com.lukacukeric.restclientdemo.controllers;

import com.lukacukeric.restclientdemo.forms.CityInputForm;
import com.lukacukeric.restclientdemo.services.WeatherSituationServices;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
class IndexController {

    private final WeatherSituationServices services;

    public IndexController(WeatherSituationServices services) {
        this.services = services;
    }

    @GetMapping
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject(new CityInputForm(null));
        return modelAndView;
    }

    @PostMapping(value = "/city")
    public ModelAndView selectedCity(@Valid CityInputForm form, Errors errors){
        ModelAndView modelAndView = new ModelAndView("index");
        if (errors.hasErrors()){
            return modelAndView;
        } else {
            return modelAndView.addObject("restResponse", services.getTemperature(form.getCityName())); //placeholder
        }

    }

    @PostMapping(value = "/city", params = "cancel")
    public ModelAndView cancelInputCity(){
        return index();
    }

}
