package com.dinallo.designpatterns.observer.weatherstation.subject;

import com.dinallo.designpatterns.observer.weatherstation.observer.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
