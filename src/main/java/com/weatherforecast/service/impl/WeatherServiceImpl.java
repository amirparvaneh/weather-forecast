package com.weatherforecast.service.impl;

import com.weatherforecast.feign.WeatherApiClient;
import com.weatherforecast.model.CityWeather;
import com.weatherforecast.model.DailyForecast;
import com.weatherforecast.model.request.WeatherApiRequest;
import com.weatherforecast.model.response.WeatherApiResponse;
import com.weatherforecast.repository.CityWeatherRepo;
import com.weatherforecast.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDate;


@Service
@RequiredArgsConstructor
public class WeatherServiceImpl implements WeatherService {

    @Value("${weather.api.key}")
    private final String apiKey;

    private final WeatherApiClient weatherApiClient;
    private final CityWeatherRepo cityWeatherRepo;


    @Override
    public WeatherApiResponse getForecast(WeatherApiRequest weatherApiRequest) {
        WeatherApiResponse apiResponse = weatherApiClient.getForecast(apiKey,
                weatherApiRequest.getCity(),
                weatherApiRequest.getDays(),
                weatherApiRequest.getAirQuality(),
                weatherApiRequest.getAlert());
        CityWeather city = cityWeatherRepo.findByName(apiResponse.getLocation().getName())
                .orElseGet(() -> new CityWeather());
        prepareCityInfo(apiResponse, city);
        prepareCityForecast(apiResponse, city);
        cityWeatherRepo.save(city);
        return apiResponse;
    }

    private void prepareCityForecast(WeatherApiResponse apiResponse, CityWeather city) {
        apiResponse.getForecast().getForecastday().forEach(forecastDay -> {
            DailyForecast dailyForecast = new DailyForecast();
            dailyForecast.setForecastDate(LocalDate.parse(forecastDay.getDate()));
            dailyForecast.setMaxTempC(forecastDay.getDay().getMaxTemp_c());
            dailyForecast.setMinTempC(forecastDay.getDay().getMinTemp_c());
            dailyForecast.setAvgTempC(forecastDay.getDay().getAvgTemp_c());
            dailyForecast.setCity(city);
            city.getForecasts().add(dailyForecast);
        });
    }

    private void prepareCityInfo(WeatherApiResponse apiResponse, CityWeather city) {
        city.setName(apiResponse.getLocation().getName());
        city.setRegion(apiResponse.getLocation().getRegion());
        city.setCountry(apiResponse.getLocation().getCountry());
        city.setLatitude(apiResponse.getLocation().getLat());
        city.setLongitude(apiResponse.getLocation().getLon());
        city.getForecasts().clear();
    }
}
