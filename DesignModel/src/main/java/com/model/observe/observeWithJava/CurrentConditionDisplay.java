package com.model.observe.observeWithJava;

import com.model.observe.observe.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        //加入observable对应的observer中
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherSubject) {
            WeatherSubject weatherSubject = (WeatherSubject) o;
            this.temperature = weatherSubject.getTemperature();
            this.humidity = weatherSubject.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current temperature is " + temperature +
                "F degrees and humidity is " + humidity + "%");
    }
}
