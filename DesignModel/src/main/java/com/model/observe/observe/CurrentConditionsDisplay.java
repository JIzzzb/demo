package com.model.observe.observe;

import com.model.observe.subject.Subject;
import com.model.observe.subject.WeatherSubject;

public class CurrentConditionsDisplay implements DisplayElement, Observer {

    private float temp;
    private float humidity;
    private float pressure;
    private WeatherSubject weatherSubject;

   public CurrentConditionsDisplay(WeatherSubject weatherSubject) {
        this.weatherSubject = weatherSubject;
        //registers this observer
        weatherSubject.resignObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temp + "℃ and " + humidity + " % humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.humidity = humidity;
        this.temp = temp;
        this.pressure = pressure;
        display();
    }
}
