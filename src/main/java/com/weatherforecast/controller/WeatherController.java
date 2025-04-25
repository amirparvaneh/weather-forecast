package com.weatherforecast.controller;


import com.weatherforecast.model.request.WeatherApiRequest;
import com.weatherforecast.model.response.WeatherApiResponse;
import com.weatherforecast.service.WeatherService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/weathers")
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;
    @Value("${weather.api.default-aqi}")
    private String aqi;
    @Value("${weather.api.default-alerts}")
    private String alerts;

    @GetMapping("/city")
    public ResponseEntity<WeatherApiResponse> getForecastCity(@RequestParam @Valid String city,
                                                              @RequestParam int days){
        WeatherApiRequest request = WeatherApiRequest.builder()
                .city(city)
                .airQuality(aqi)
                .days(days)
                .alert(alerts)
                .build();
        WeatherApiResponse forecast = weatherService.getForecast(request);
        return ResponseEntity.ok(forecast);
    }
}
