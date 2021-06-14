package Observers;

public class MSTempObserver implements Observer {
    MonitoringScreen ms;
    public MSTempObserver(MonitoringScreen ms){
        this.ms=ms;
        System.out.println("MSTempObserver was created");
    }
    @Override
    public void update(int data) {
        ms.displayTemperature(data);
    }
}