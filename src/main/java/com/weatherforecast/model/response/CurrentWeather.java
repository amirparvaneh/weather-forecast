package com.weatherforecast.model.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrentWeather {
    private long lastUpdatedEpoch;
    private String lastUpdated;
    private double tempC;
}
