package Observers;

public class MSTempObserver implements Observer {
    MonitoringScreen ms;
    @Override
    public void update(int data) {
        ms.displayTemperature(data);
    }
}