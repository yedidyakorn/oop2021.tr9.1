package Observables;

import java.util.ArrayList;

public class AlarmClock
{
    public final int CLOCK_INTERVAL_MILLIS = 100;
    public static AlarmClock instance = null;
    private ArrayList<AlarmClockRecord> itsAlarmClockRecords = new ArrayList<>();

    protected AlarmClock() {}
    public static AlarmClock theInstance()
    {
        if(null==instance)
            instance = new AlarmClock();
        return instance;
    }

    protected void tic(){
        for(AlarmClockRecord alarmClockRecord: itsAlarmClockRecords){
            if (alarmClockRecord.getIntervalDecRement()-CLOCK_INTERVAL_MILLIS<=0){
                alarmClockRecord.getpAlarmListener().wakeup();
                alarmClockRecord.setIntervalDecRement(alarmClockRecord.getInterval());
            }
            else
                alarmClockRecord.setIntervalDecRement(alarmClockRecord.getIntervalDecRement()-CLOCK_INTERVAL_MILLIS);
        }
    }

    public void register(int interval, AlarmListener pal) {
        itsAlarmClockRecords.add(new AlarmClockRecord(interval,pal));
        System.out.println(pal.getSensorName()+" registered to clock");

    }
}

