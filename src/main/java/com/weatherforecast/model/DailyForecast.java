package com.weatherforecast.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DailyForecast {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate forecastDate;
    private double maxtempC;
    private double mintempC;
    private double avgtempC;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "city_weather_id")
    private CityWeather cityWeather;
}