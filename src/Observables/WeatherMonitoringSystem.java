package Observables;

import Nimbus1.Nimbus1Clock;
import Nimbus1.Nimbus1PressureSensor;
import Nimbus1.Nimbus1TemepratureSensor;
import Observers.Observer;

public class WeatherMonitoringSystem {
    public static WeatherMonitoringSystem instance = null;
    private AlarmClock nimbus1Clock;
    private Nimbus1PressureSensor nimbus1PressureSensor;
    private Nimbus1TemepratureSensor nimbus1TemepratureSensor;
    private PressureTrendSensor pressureTrendSensor;
    public WeatherMonitoringSystem(){
        System.out.println("WeatherMonitoringSystem was created");
        nimbus1Clock=Nimbus1Clock.theInstance();
        nimbus1PressureSensor=new Nimbus1PressureSensor("pressure",1100);
        nimbus1TemepratureSensor=new Nimbus1TemepratureSensor("temperature",700);
        pressureTrendSensor=new PressureTrendSensor(nimbus1PressureSensor);
    }

    public static WeatherMonitoringSystem theInstance() {
        if (null == instance)
            instance = new WeatherMonitoringSystem();
        return instance;
    }
    public void addPressureTrendObservar(Observer observer) {
        pressureTrendSensor.addObserever(observer);
        System.out.println(observer.getClass().getName()+ " observes pressure trend");
    }
    public void addPressureObservar(Observer observer) {
        nimbus1PressureSensor.addObserever(observer);
        System.out.println(observer.getClass().getName()+ " observes pressure");
    }
    public void addTemperatureObservar(Observer observer) {
        nimbus1TemepratureSensor.addObserever(observer);
        System.out.println(observer.getClass().getName()+ " observes temperature");    }




}
