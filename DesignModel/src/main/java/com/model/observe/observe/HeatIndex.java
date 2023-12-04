package com.model.observe.observe;

import com.model.observe.subject.Subject;
import com.model.observe.subject.WeatherSubject;

public class HeatIndex implements DisplayElement, Observer {
    private float temperature;
    private float humidity;
    private WeatherSubject weatherSubject;

    public HeatIndex(WeatherSubject weatherSubject) {
        this.weatherSubject = weatherSubject;
        weatherSubject.resignObserver(this);
    }

    @Override
    public void display() {

    }

    @Override
    public void update(float temp, float humidity, float pressure) {

    }
}
