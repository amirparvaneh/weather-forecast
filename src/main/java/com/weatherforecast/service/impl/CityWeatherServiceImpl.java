package com.weatherforecast.service.impl;

import com.weatherforecast.exception.NotFoundException;
import com.weatherforecast.mapper.CityWeatherMapper;
import com.weatherforecast.model.response.CityWeatherResponse;
import com.weatherforecast.repository.CityWeatherRepo;
import com.weatherforecast.service.CityWeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CityWeatherServiceImpl implements CityWeatherService {

    private final CityWeatherRepo cityWeatherRepo;
    private final CityWeatherMapper cityWeatherMapper;

    @Override
    public CityWeatherResponse getCityWeatherByName(String cityName) {
        return cityWeatherMapper.cityWeatherToDto(cityWeatherRepo.findByName(cityName).orElseThrow(() ->
                new NotFoundException("this city not found with this name" + cityName)));
    }
}
