package com.weatherforecast.feign;

import com.weatherforecast.model.response.WeatherApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "weather api", url = "${weather.api.base-url}")
public interface WeatherApiClient {

    @GetMapping("/v1/forecast.json")
    WeatherApiResponse getForecast(
            @RequestParam("key") String apiKey,
            @RequestParam("q") String city,
            @RequestParam(value = "days", defaultValue = "2") int days,
            @RequestParam(value = "aqi", defaultValue = "no") String aqi,
            @RequestParam(value = "alerts", defaultValue = "no") String alerts
    );
}
