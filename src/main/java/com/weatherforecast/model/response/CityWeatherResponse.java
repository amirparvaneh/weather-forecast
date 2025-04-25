package com.weatherforecast.model.response;


import com.weatherforecast.model.DailyForecast;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CityWeatherResponse {
    private String name;
    private String region;
    private String country;
    private double latitude;
    private double longitude;
    private List<DailyForecast> forecasts;
}
