package com.weatherforecast.repository;

import com.weatherforecast.model.DailyForecast;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DailyForecastRepo extends JpaRepository<DailyForecast,Long> {
}
