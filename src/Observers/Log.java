package Observers;

import Observables.WeatherMonitoringSystem;

public class Log {
    public Log(WeatherMonitoringSystem ws) {

    }
    public void displayPressure(int data){
        System.out.println("Log: pressure = "+data+ "millibars");
    }

    public void displayPressureTrend(int data) {
        final int RISING = 1,FALLING = -1,STABLE = 0;
        switch (data){
            case 1:
                data=RISING;
                break;
            case 0:
                data=STABLE;
                break;
            case -1:
                data=FALLING;
                break;
        }
        System.out.println("Log: pressure trend = "+data);

    }
}
