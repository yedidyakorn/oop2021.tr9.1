package Observables;

import Observers.Observer;

public class PressureTrendSensor extends Obserable implements Observer {
//    private enum Trend {RISING, FALLING ,STABLE}
    int RISING = 1,FALLING = -1,STABLE = 0;
    private int lastState;
    private int state;
    private int lastReading1;
    private int lastReading2;
    private int lastReading3;



    private int calcTrend (int data) {
        if (lastReading1 < lastReading2) {
            if (lastReading2 < lastReading3) {
                lastState = state;
                return state = RISING;
            } else {
                lastState = state;
                return state = STABLE;
            }
        }
        if (lastReading1 > lastReading2) {
            if (lastReading2 > lastReading3) {
                lastState = state;
                return state = FALLING;
            } else {
                lastState = state;
                return state = STABLE;
            }
        }
        return state;
    }
    public void chek(int data){
     int trend = calcTrend(data);
     if(trend!=lastState){
         notifyObservers( trend);
     }
    }

    @Override
    public void update(int data) {

    }
}
