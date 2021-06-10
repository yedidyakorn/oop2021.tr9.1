package Observables;

import Observers.Observer;

import java.util.ArrayList;

public class Obserable {
    private ArrayList<Observer> observerArrayList= new ArrayList<>();
    public void notifyObservers(int data){
        for (Observer observer: observerArrayList){
            observer.update(data);
        }
    }
}
