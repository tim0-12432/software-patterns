package de.tim0_12432.mixin;

public interface Stateful {

    <T> T getState(Class clazz, T initial);

    <T> void setState(Class clazz, T state);
}
