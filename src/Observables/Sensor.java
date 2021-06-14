package Observables;

public abstract class Sensor extends Observable {
    protected int interval;
    protected int lastRead;
    protected String type;

    public Sensor() {

    }


    public void check() {
        int temp = read();
        if (temp != lastRead) {
            lastRead = temp;
            notifyObservers(temp);
        }

    }

    public abstract int read();

}
