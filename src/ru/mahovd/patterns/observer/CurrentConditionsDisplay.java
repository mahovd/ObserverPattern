/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.mahovd.patterns.observer;

/**
 *
 * @author dmitrijmahov
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{
    
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
    
    public void display(){
        System.out.println("Current conditions are: "+temperature+" C degrees "
                + "and "+humidity+" % humidity and "+pressure+
                " mm pressure");
    }
    
}
