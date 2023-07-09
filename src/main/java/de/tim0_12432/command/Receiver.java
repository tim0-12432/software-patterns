package de.tim0_12432.command;

public class Receiver {

    private int value;

    public Receiver() {
        value = 0;
    }

    public void increment() {
        value++;
    }

    public void decrement() {
        value--;
    }

    public int getValue() {
        return value;
    }
}
