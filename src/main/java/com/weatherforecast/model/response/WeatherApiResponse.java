package com.weatherforecast.model.response;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WeatherApiResponse {
    private Location location;
    private CurrentWeather current;
    private Forecast forecast;
}
