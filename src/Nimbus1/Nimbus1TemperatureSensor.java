package Nimbus1;

import Observables.Sensor;

public class Nimbus1TemperatureSensor extends Sensor {



    public int read() {

        return RandomSupplier.getRnd().nextInt(40);
    }


}
