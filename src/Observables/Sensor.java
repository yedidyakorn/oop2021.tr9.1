package Observables;

import Nimbus1.Nimbus1Clock;

public abstract class Sensor extends Obserable {
    public Sensor() {

    }

    protected int interval;
    protected int lastRead;
    protected String type;

    public void check() {
        int temp = read();
        if (temp != lastRead) {
            lastRead = temp;
            notifyObservers(temp);
        }

    }

    public abstract int read();

}
