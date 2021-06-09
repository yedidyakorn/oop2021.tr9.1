package Observables;

import Nimbus1.Nimbus1Clock;

public abstract class Sensor extends Obserable {
    public Sensor(){
        Nimbus1Clock.instance.wakeEvery(alntrval,SensorAlamListtener);
    }

}
