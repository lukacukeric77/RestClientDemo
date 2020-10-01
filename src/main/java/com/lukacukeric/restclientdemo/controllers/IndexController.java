package com.lukacukeric.restclientdemo.controllers;

import com.lukacukeric.restclientdemo.forms.CityInputForm;
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

    @GetMapping
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject(new CityInputForm(null, null));
        return modelAndView;
    }

    @PostMapping(value = "/city")
    public ModelAndView selectedCity(@Valid CityInputForm form, Errors errors){
        if (errors.hasErrors()){
            return new ModelAndView("index", "sendingData", errors.getFieldErrorCount());

        } else {
            return new ModelAndView("index"); //placeholder
        }

    }

    @PostMapping(value = "/city", params = "cancel")
    public ModelAndView cancelInputCity(){
        return index();
    }

}
