package com.weatherforecast.model.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class DayWeather {
    private Double maxTemp_c;
    private Double minTemp_c;
    private Double avgTemp_c;
}