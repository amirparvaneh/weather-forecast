package com.weatherforecast.mapper;


import com.weatherforecast.model.CityWeather;
import com.weatherforecast.model.response.CityWeatherResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CityWeatherMapper {

    CityWeatherResponse cityWeatherToDto(CityWeather cityWeather);
    List<CityWeatherResponse> allCityToDto(List<CityWeather> cityWeathers);
}
