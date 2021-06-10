package Observables;

public class AlarmClockRecord {
    private int interval;
    private int intervalDecRement;
    private AlarmListener pAlarmListener;

    public AlarmClockRecord(int interval, AlarmListener pAlarmListener){
        this.interval=intervalDecRement=interval;
        this.pAlarmListener=pAlarmListener;
    }

}
