package com.model.observe.observeWithJava;

import com.model.observe.observe.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 29.92f;
    private float lastPressure;
    private Observable obs;

    public ForecastDisplay(Observable obs) {
        this.obs = obs;
        obs.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Improving weather on the way !!!");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherSubject) {
            lastPressure = currentPressure;
            this.currentPressure = ((WeatherSubject) o).getPressure();
            display();
        }
    }
}
