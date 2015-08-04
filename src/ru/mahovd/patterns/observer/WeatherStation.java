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
public class WeatherStation {
    
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        
        CurrentConditionsDisplay currentConditionsDisplay 
                = new CurrentConditionsDisplay(weatherData);
        
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        
        weatherData.setMeasurements(30, 122, 82);
        weatherData.setMeasurements(27, 90, 70);
    }
}
