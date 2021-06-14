package Nimbus1;

import Observables.Sensor;
import Observables.SensorAlarmListener;

import java.util.Random;

public class Nimbus1TemepratureSensor extends Sensor {

    Random rand=RandomSupplier.getRnd();

    public Nimbus1TemepratureSensor(String type, int inteval){
        this.interval=inteval;
        this.type=type;
        Nimbus1Clock.theInstance().register(interval,new SensorAlarmListener(this));
    }


    public int read() {
        return rand.nextInt(40);
    }


}
