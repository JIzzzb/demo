package com.model.observe.subject;

import com.model.observe.observe.Observer;

import java.util.ArrayList;

public class WeatherSubject implements Subject {

    private ArrayList<Observer> observers;

    private float temp;
    private float humidity;
    private float pressure;

    public WeatherSubject() {
        observers = new ArrayList<>();
    }

    @Override
    public void resignObserver(Observer ob) {
        observers.add(ob);
    }

    @Override
    public void removeObserver(Observer ob) {
        int index = observers.indexOf(ob);
        if (index != -1) {
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            //observer update
            observer.update(temp, humidity, pressure);
        }
    }

    private void measurementChanged() {
        notifyObservers();
    }

    //when update parameters then notify all observers
    public void setChangedParameters(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }
}
