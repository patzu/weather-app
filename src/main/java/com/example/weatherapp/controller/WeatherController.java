// src/main/java/com/example/weatherapp/controller/WeatherController.java

package com.example.weatherapp.controller;

import com.example.weatherapp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/temperature")
    public String getTemperature() {
        Double temp = weatherService.getTemperature();
        if (temp != null) {
            return String.format("Current temperature in %s is %.2f°C", weatherService.getCity(), temp);
        } else {
            return "Unable to fetch temperature data.";
        }
    }
}
