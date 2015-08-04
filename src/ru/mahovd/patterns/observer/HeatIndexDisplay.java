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
public class HeatIndexDisplay implements Observer, DisplayElement{
    
    private float t;
    private float rh;
    private float pressure;
    private float heatIndex;
    private Subject weatherData;

    public HeatIndexDisplay(WeatherData wd) {
        this.weatherData = wd;
        weatherData.registerObserver(this);
    }    
    

    @Override
    public void display() {
        
        heatIndex = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) +
            (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) +
            (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
            (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *  
            (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
            (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +     
            0.000000000843296 * (t * t * rh * rh * rh)) -
            (0.0000000000481975 * (t * t * t * rh * rh * rh)));
        
        System.out.println("Heat index is "+heatIndex);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.t = temp;
        this.rh = humidity;
        this.pressure = pressure;
        display();
    }
        
    
}
