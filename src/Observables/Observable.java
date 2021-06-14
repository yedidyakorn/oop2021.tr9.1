package Observables;

import Observers.Observer;

import java.util.ArrayList;

public class Observable {
    private ArrayList<Observer> observerArrayList;
    public Observable(){
        observerArrayList=new ArrayList<>();
    }
    public void addObserever(Observer observer){
        observerArrayList.add(observer);
    }
    public void notifyObservers(int data){
        for (Observer observer: observerArrayList){
            observer.update(data);
        }
    }
}
