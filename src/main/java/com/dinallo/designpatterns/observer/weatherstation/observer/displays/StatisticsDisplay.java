package com.dinallo.designpatterns.observer.weatherstation.observer.displays;

import com.dinallo.designpatterns.observer.weatherstation.observer.DisplayElement;
import com.dinallo.designpatterns.observer.weatherstation.observer.Observer;
import com.dinallo.designpatterns.observer.weatherstation.subject.Subject;

/**
 * StatisticsDisplay
 * <br>
 * <code>com.dinallo.designpatterns.observer.weatherstation.observer.displays.StatisticsDisplay</code>
 * <br>
 *
 * @since 17 February 2023
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    private Float minTemp;
    private float avgTemp;
    private Float maxTemp;
    private final Subject weatherData;

    public StatisticsDisplay(final Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Average temperature %s C°, Maximum temperature %s C°, Minimum temperature %s C°.%n", avgTemp,
            maxTemp, minTemp);
    }

    @Override
    public void update(final float temperature, final float humidity, final float pressure) {
        maxTemp = maxTemp == null ? temperature : Math.max(temperature, maxTemp);
        minTemp = minTemp == null ? temperature : Math.min(temperature, minTemp);
        avgTemp = (maxTemp + minTemp)/2;
        display();
    }
}
