package com.dinallo.designpatterns.observer.weatherstation.observer.displays;

import com.dinallo.designpatterns.observer.weatherstation.observer.DisplayElement;
import com.dinallo.designpatterns.observer.weatherstation.observer.Observer;
import com.dinallo.designpatterns.observer.weatherstation.subject.Subject;

/**
 * HeatIndexDisplay
 * <br>
 * <code>com.dinallo.designpatterns.observer.weatherstation.observer.displays.HeatIndexDisplay</code>
 * <br>
 *
 * @since 17 February 2023
 */
public class HeatIndexDisplay implements Observer, DisplayElement {
    private float heatIndex;
    private final Subject weatherData;

    public HeatIndexDisplay(final Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Heat index: %s.%n", heatIndex);
    }

    @Override
    public void update(final float temperature, final float humidity, final float pressure) {
        heatIndex = computeHeatIndex(temperature, humidity);
        display();
    }

    private float computeHeatIndex(float t, float rh) {
        return (float) ((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) +
            (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) +
            (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
            (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
            (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
            (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
            0.000000000843296 * (t * t * rh * rh * rh)) -
            (0.0000000000481975 * (t * t * t * rh * rh * rh)));
    }
}
