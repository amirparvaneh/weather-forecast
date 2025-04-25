package com.weatherforecast.repository;

import com.weatherforecast.model.CityWeather;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface CityWeatherRepo extends JpaRepository<CityWeather,Long> {

    Optional<CityWeather> findByName(String name);
}
