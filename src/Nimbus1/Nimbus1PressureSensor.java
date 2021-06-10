package Nimbus1;

import Observables.Sensor;


public class Nimbus1PressureSensor extends Sensor {


    //    public void check(){
//        int temp=read();
//        if(temp!=lastRead){
//            lastRead=temp;
//            notify(temp);
//        }
    public int read() {
        return RandomSupplier.getRnd().nextInt(100)+950;
    }

    Nimbus1Clock.instance.wakeEvery(alntrval,SensorAlamListtener);

}




