package com.weatherforecast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class WeatherforecastApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherforecastApplication.class, args);
    }

}
