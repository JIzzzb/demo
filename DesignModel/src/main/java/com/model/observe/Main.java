package com.model.observe;


import com.model.observe.observeWithJava.CurrentConditionDisplay;
import com.model.observe.observeWithJava.ForecastDisplay;
import com.model.observe.observeWithJava.WeatherSubject;

public class Main {
    public static void main(String[] args) {
//        WeatherSubject weatherSubject = new WeatherSubject();
//        CurrentConditionsDisplay current = new CurrentConditionsDisplay(weatherSubject);
//        weatherSubject.setChangedParameters(30.5f, 60, 34.5f);
        WeatherSubject weatherSubject = new WeatherSubject();
        CurrentConditionDisplay current = new CurrentConditionDisplay(weatherSubject);
        ForecastDisplay forecast = new ForecastDisplay(weatherSubject);
        weatherSubject.setMeasurement(30.5f, 60.0f, 35.5f);
    }
}
