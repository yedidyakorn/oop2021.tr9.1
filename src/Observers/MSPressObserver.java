package Observers;

public class MSPressObserver implements Observer {

    MonitoringScreen ms;

    @Override
    public void update(int data) {
        ms.displayPressure(data);
    }
}