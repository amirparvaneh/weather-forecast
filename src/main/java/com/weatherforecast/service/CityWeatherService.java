package com.weatherforecast.service;

import com.weatherforecast.model.CityWeather;
import com.weatherforecast.model.response.CityWeatherResponse;

public interface CityWeatherService {

    CityWeatherResponse getCityWeatherByName(String cityName);
}
