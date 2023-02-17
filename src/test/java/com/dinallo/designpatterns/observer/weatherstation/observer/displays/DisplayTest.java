package com.dinallo.designpatterns.observer.weatherstation.observer.displays;

import com.dinallo.designpatterns.observer.weatherstation.subject.WeatherData;
import lombok.val;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * CurrentConditionsDisplayTest
 * <br>
 * <code>com.dinallo.designpatterns.observer.weatherstation.observer.displays.CurrentConditionsDisplayTest</code>
 * <br>
 *
 * @since 17 February 2023
 */
class DisplayTest {

    private WeatherData weatherData;

    @BeforeEach
    void setUp() {
        weatherData = new WeatherData();
        new CurrentConditionsDisplay(weatherData);
        new StatisticsDisplay(weatherData);
        new ForecastDisplay(weatherData);
        new HeatIndexDisplay(weatherData);
    }

    @Test
    void itShouldShowDisplays(){
        weatherData.setMeasurements(30, 45, 85);
        weatherData.setMeasurements(32, 70, 60);
        weatherData.setMeasurements(22, 30, 10);
    }
}
