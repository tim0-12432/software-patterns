package de.tim0_12432.observer;

public interface Observer<T> {

    void update(Observable obj, T arg);
}
