package Observables;

import Observers.Observer;

public class PressureTrendSensor extends Obserable implements Observer {
    private enum Trend {RISING, FALLING ,STABLE}

    private Trend lastState;
    private Trend state;
    private int lastReading1;
    private int lastReading2;
    private int lastReading3;



    private Trend calcTrend (int data){
//        if(lastReading1<lastReading2){
//            if (lastReading2<lastReading3){
//                lastState=state;
//                return state=Trend.RISING;
//            }
//            else {
//
//            }
//
//        }
    }
    @Override
    public void update(int data) {

    }
}
