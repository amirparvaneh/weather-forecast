package com.weatherforecast.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DailyForecast extends JpaRepository<DailyForecast,Long> {
    List<DailyForecast> findByCityIdOrderByForecastDate(Long cityId);
}
