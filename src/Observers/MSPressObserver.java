package Observers;

public class MSPressObserver implements Observer {

    MonitoringScreen ms;
    public MSPressObserver(MonitoringScreen ms){
        this.ms=ms;
        System.out.println("MSPressObserver was created");
    }

    @Override
    public void update(int data) {
        ms.displayPressure(data);
    }
}