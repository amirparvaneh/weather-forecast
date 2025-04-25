package com.weatherforecast.model.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class CurrentWeather {
    private long lastUpdatedEpoch;
    private String lastUpdated;
    private double tempC;
}
