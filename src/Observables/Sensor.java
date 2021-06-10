package Observables;

import Nimbus1.Nimbus1Clock;

public abstract class Sensor extends Obserable {
    public Sensor() {

    }

    int interval;
    protected int lastRead;
    String type;

    public void check() {
        int temp = read();
        if (temp != lastRead) {
            lastRead = temp;
            notifyObservers(temp);
        }

    }

    public abstract int read();

        Nimbus1Clock.instance.register(int,AlarmListener);


}
