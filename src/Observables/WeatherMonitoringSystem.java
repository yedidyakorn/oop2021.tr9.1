package Observables;

import Nimbus1.Nimbus1Clock;
import Nimbus1.Nimbus1PressureSensor;
import Nimbus1.Nimbus1TemepratureSensor;
import Observers.Observer;

public class WeatherMonitoringSystem {
    public static WeatherMonitoringSystem instance = null;
    private Observable observable;
    private AlarmClock nimbus1Clock;
    private Nimbus1PressureSensor nimbus1PressureSensor;
    private Nimbus1TemepratureSensor nimbus1TemepratureSensor;
    public WeatherMonitoringSystem(){
        System.out.println("WeatherMonitoringSystem was created");
        observable =new Observable();
        nimbus1Clock=Nimbus1Clock.theInstance();
        nimbus1TemepratureSensor=new Nimbus1TemepratureSensor("temperature",700);
        nimbus1PressureSensor=new Nimbus1PressureSensor("pressure",1100);
    }

    public static WeatherMonitoringSystem theInstance() {
        if (null == instance)
            instance = new WeatherMonitoringSystem();
        return instance;
    }

    public void addPressureObservar(Observer observer) {
        observable.addObserever(observer);
    }
    public void addTemperatureObservar(Observer observer) {
        observable.addObserever(observer);
    }
    public void addPressureTrendObservar(Observer observer) {
        observable.addObserever(observer);
    }



}
