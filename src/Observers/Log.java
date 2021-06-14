package Observers;

import Observables.WeatherMonitoringSystem;

public class Log {
    WeatherMonitoringSystem ws;
    public Log(WeatherMonitoringSystem ws) {
        this.ws=ws;
        System.out.println("Log was created");
        ws.addPressureObservar(new LogPressObserver(this));
        ws.addPressureTrendObservar(new LogPressTrendObserver(this));
    }
    public void displayPressure(int data){
        System.out.println("Log: pressure = "+data+ " millibars");
    }

    public void displayPressureTrend(int data) {
        String result="";
        switch (data){
            case 1:
                result="RISING";
                break;
            case 0:
                result="STABLE";
                break;
            case -1:
                result="FALLING";
                break;
        }
        System.out.println("Log: pressure trend = "+result);

    }
}
