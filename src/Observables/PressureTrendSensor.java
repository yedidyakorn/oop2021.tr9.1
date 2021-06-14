package Observables;

import Nimbus1.Nimbus1PressureSensor;
import Nimbus1.Nimbus1TemepratureSensor;
import Observers.Observer;

public class PressureTrendSensor extends Observable implements Observer {
    final int RISING = 1,FALLING = -1,STABLE = 0;
    private int lastState=0;
    private int state=0;
    private int lastReading1=0;
    private int lastReading2=0;
    private int lastReading3=0;

    public PressureTrendSensor(Nimbus1PressureSensor observer){
        observer.addObserever(this);
        System.out.println("PressureTrendSensor observes pressure");
    }


    private void calcTrend (int data) {
        lastReading1=lastReading2;
        lastReading2=lastReading3;
        lastReading3=data;
        if (lastReading1 < lastReading2) {
            if (lastReading2 < lastReading3) {
                 state = RISING;
            } else {
                 state = STABLE;
            }
        }
        if (lastReading1 > lastReading2) {
            if (lastReading2 > lastReading3) {
                 state = FALLING;
            } else {
                 state = STABLE;
            }
        }

    }
    public void check(int data){
        calcTrend(data);
        if(state!=lastState)
            notifyObservers(state);
        lastState=state;
    }

    @Override
    public void update(int data) {
        check(data);
    }
}
