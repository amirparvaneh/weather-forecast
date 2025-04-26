package com.weatherforecast.service;

import com.weatherforecast.model.response.CityWeatherResponse;

import java.util.List;

public interface CityWeatherService {

    CityWeatherResponse getCityWeatherByName(String cityName);
    List<CityWeatherResponse> getAll();
}
