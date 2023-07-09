package de.tim0_12432.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable<T> {

    private final List<Observer<T>> observers = new ArrayList<>();

    public void addObserver(Observer<T> o) {
        observers.add(o);
    }

    public void removeObserver(Observer<T> o) {
        observers.remove(o);
    }

    public void notifyObservers(T arg) {
        for (Observer<T> o : observers) {
            o.update(this, arg);
        }
    }
}
