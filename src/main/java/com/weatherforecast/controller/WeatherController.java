package com.weatherforecast.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/weathers")
@RequiredArgsConstructor
public class WeatherController {

}
