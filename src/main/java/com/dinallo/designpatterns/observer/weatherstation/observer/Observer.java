package com.dinallo.designpatterns.observer.weatherstation.observer;

public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
