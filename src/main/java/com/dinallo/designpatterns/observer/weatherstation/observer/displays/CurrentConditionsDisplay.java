package com.dinallo.designpatterns.observer.weatherstation.observer.displays;

import com.dinallo.designpatterns.observer.weatherstation.observer.DisplayElement;
import com.dinallo.designpatterns.observer.weatherstation.observer.Observer;
import com.dinallo.designpatterns.observer.weatherstation.subject.Subject;

/**
 * CurrentConditionsDisplay
 * <br>
 * <code>com.dinallo.designpatterns.observer.weatherstation.observer.displays.CurrentConditionsDisplay</code>
 * <br>
 *
 * @since 17 February 2023
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private final Subject weatherData;

    public CurrentConditionsDisplay(final Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Current conditions: %s C degrees and %s humidity.%n", temperature, humidity);
    }

    @Override
    public void update(final float temperature, final float humidity, final float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
