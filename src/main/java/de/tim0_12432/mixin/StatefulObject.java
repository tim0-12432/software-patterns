package de.tim0_12432.mixin;

import java.util.HashMap;

public class StatefulObject implements Stateful {

    private final HashMap<Class, Object> states = new HashMap<>();

    @Override
    public <T> T getState(Class clazz, T initial) {
        if (states.containsKey(clazz)) {
            return (T) states.get(clazz);
        } else {
            states.put(clazz, initial);
            return initial;
        }
    }

    @Override
    public <T> void setState(Class clazz, T state) {
        states.put(clazz, state);
    }
}
