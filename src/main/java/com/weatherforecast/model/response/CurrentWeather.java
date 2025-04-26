package com.weatherforecast.model.response;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CurrentWeather {
    private long lastUpdatedEpoch;
    private String lastUpdated;
    private double tempC;
}
