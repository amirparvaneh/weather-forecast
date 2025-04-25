package com.weatherforecast.service;

import com.weatherforecast.model.request.WeatherApiRequest;
import com.weatherforecast.model.response.WeatherApiResponse;

public interface WeatherService {
    WeatherApiResponse getForecast(WeatherApiRequest weatherApiRequest);
}
