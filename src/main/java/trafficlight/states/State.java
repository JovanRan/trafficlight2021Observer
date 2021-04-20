package trafficlight.states;

import java.util.ArrayList;
import java.util.List;

import pattern.Observer;
import pattern.Subject;

//TODO implement a part of the pattern here

public abstract class State implements Subject{

    public List<Observer> observers = new ArrayList<Observer>();

    public abstract State getNextState();

    public abstract String getColor();

    public String getSting(){
        return getColor();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void remove(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}