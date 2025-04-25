package com.weatherforecast.controller;


import com.weatherforecast.model.response.CityWeatherResponse;
import com.weatherforecast.service.CityWeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class CityWeatherController {

    private final CityWeatherService cityWeatherService;

    @GetMapping("/{city}")
    public ResponseEntity<CityWeatherResponse> getCityWeather(@PathVariable String city){
        CityWeatherResponse cityWeatherByName = cityWeatherService.getCityWeatherByName(city);
        return ResponseEntity.ok(cityWeatherByName);
    }

}
