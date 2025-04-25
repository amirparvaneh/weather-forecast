package com.weatherforecast.model.request;


import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WeatherApiRequest {
    @NotNull
    private String city;
    private int days;
    private String airQuality;
    private String alert;
}
