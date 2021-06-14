package Observers;

import Observables.WeatherMonitoringSystem;

public class MonitoringScreen {
    WeatherMonitoringSystem ws;
    public MonitoringScreen(WeatherMonitoringSystem ws) {
        this.ws=ws;
        ws.addPressureObservar(new MSPressObserver(this));
        ws.addTemperatureObservar(new MSTempObserver(this));

    }
    public void displayTemperature(int data){
        System.out.println("MonitoringScreen: temperature = "+data+" Celsius");
    }
    public void displayPressure(int data){
        System.out.println("MonitoringScreen: pressure = "+data+ "millibars");
    }
}
