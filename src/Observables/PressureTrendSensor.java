package Observables;

import Observers.Observer;

public class PressureTrendSensor extends Obserable implements Observer {
//    private enum Trend {RISING, FALLING ,STABLE}
    final int RISING = 1,FALLING = -1,STABLE = 0;
    private int lastState;
    private int state;
    private int lastReading1=0;
    private int lastReading2=0;
    private int lastReading3=0;



    private void calcTrend (int data) {
        lastReading3=data;
        lastReading2=lastReading3;
        lastReading1=lastReading2;
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
            notifyObservers( state);
        lastState=state;
    }

    @Override
    public void update(int data) {
        check(data);
    }
}
