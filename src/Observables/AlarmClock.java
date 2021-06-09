package Observables;

import java.util.ArrayList;

public class AlarmClock
{
    public final int CLOCK_INTERVAL_MILLIS = 100;
    protected static AlarmClock instance = null;
    private ArrayList<AlarmClockRecord> itsAlarmClockRecords = new ArrayList();

    protected AlarmClock() {}
    public static AlarmClock theInstance()
    {
        if(null==instance)
            instance = new AlarmClock();
        return instance;
    }
    void wakeEvery(int alntrval,int pAlamListtener){
        AlarmClockRecord.add(new SensorAlarmListener(alntrval,pAlamListtener))
    }
    protected void tic(){
        //TODO: fix
    }

    public void register(int interval, AlarmListener pal) {
        //TODO: fix
    }
}

