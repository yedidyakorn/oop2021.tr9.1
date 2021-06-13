package Observables;

public class AlarmClockRecord {
    private int interval;
    private int intervalDecRement;
    private AlarmListener pAlarmListener;

    public AlarmClockRecord(int interval, AlarmListener pAlarmListener){
        this.interval=intervalDecRement=interval;
        this.pAlarmListener=pAlarmListener;
    }

    public int getIntervalDecRement() {
        return intervalDecRement;
    }

    public AlarmListener getpAlarmListener() {
        return pAlarmListener;
    }

    public int getInterval() {
        return interval;
    }

    public void setIntervalDecRement(int intervalDecRement) {
        this.intervalDecRement = intervalDecRement;
    }
}
