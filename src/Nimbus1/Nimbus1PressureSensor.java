package Nimbus1;

import Observables.Sensor;

import java.util.Random;


public class Nimbus1PressureSensor extends Sensor {

   Random rand=RandomSupplier.getRnd();
//
//        public void check(){
//        int temp=read();
//        if(temp!=lastRead){
//            lastRead=temp;
//            notify(temp);
//        }
    public int read() {

        return rand.nextInt(100)+950;
    }

    Nimbus1Clock.instance.wakeEvery(alntrval,SensorAlamListtener);

}




