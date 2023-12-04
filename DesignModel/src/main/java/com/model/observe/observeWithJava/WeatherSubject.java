package com.model.observe.observeWithJava;

import java.util.Observable;

public class WeatherSubject extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public void measurementChanged() {
        setChanged();
        notifyObservers();
    }
    //不需要为建立observer集合
    public WeatherSubject(){}

    public void setMeasurement(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    //方便观察者主动拉取所需要的状态
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
