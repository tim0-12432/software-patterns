package de.tim0_12432.adapter;

public class Adapter extends LibAdaptee implements Target {

    @Override
    public void adaptedMethod(String text) {
        System.out.println("Adapted: " + text);
        libSpecificMethod();
    }
}
