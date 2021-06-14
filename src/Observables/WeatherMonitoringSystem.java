package Observables;

import Observers.Log;
import Observers.LogPressObserver;
import Observers.MonitoringScreen;
import Observers.Observer;

public class WeatherMonitoringSystem {
//    Log log;
//    MonitoringScreen ms;
//    public WeatherMonitoringSystem (){
//        log=new Log(this);
//        ms=new MonitoringScreen(this);
//    }
    public static WeatherMonitoringSystem theInstance() {

    }
    public void addPressureObservar(Observer observer){
        LogPressObserver logPressObserver=new LogPressObserver(log);
    }
}
