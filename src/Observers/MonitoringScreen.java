package Observers;

import Observables.WeatherMonitoringSystem;

public class MonitoringScreen {
    WeatherMonitoringSystem ws;
    public MonitoringScreen(WeatherMonitoringSystem ws) {
        this.ws=ws;
    }
    public void displayTemperature(int data){
        System.out.println("MonitoringScreen: temperature = "+data+" Celsius");
    }
    public void displayPressure(int data){
        System.out.println("MonitoringScreen: pressure = "+data+ "millibars");
    }
}
