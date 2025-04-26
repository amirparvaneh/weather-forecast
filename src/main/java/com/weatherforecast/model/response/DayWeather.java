package com.weatherforecast.model.response;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DayWeather {
    private Double maxtemp_c;
    private Double mintemp_c;
    private Double avgtemp_c;
}