package com.dinallo.designpatterns.observer.weatherstation.observer.displays;

import com.dinallo.designpatterns.observer.weatherstation.observer.DisplayElement;
import com.dinallo.designpatterns.observer.weatherstation.observer.Observer;
import com.dinallo.designpatterns.observer.weatherstation.subject.Subject;

/**
 * ForecastDisplay
 * <br>
 * <code>com.dinallo.designpatterns.observer.weatherstation.observer.displays.ForecastDisplay</code>
 * <br>
 *
 * @since 17 February 2023
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private String forecast;
    private final Subject weatherData;

    public ForecastDisplay(final Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.printf("Forecast weather: %s%n", forecast);
    }

    @Override
    public void update(final float temperature, final float humidity, final float pressure) {
        if (pressure > 80)
            forecast = "Storm is coming!";
        else if (pressure > 50)
            forecast = "Nice weather ahead, enjoy!";
        else
            forecast = "Very hot day is coming, stay at home!";
        display();
    }
}
