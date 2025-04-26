package com.weatherforecast.model.response;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ForecastDay {
    private String date;
    private DayWeather day;
}
