package de.tim0_12432.singleton;

public class CallCounter {

    private static CallCounter instance;
    private static int counter = 0;

    private CallCounter() {
    }

    public static CallCounter getInstance() {
        counter++;
        if (instance == null) {
            instance = new CallCounter();
        }
        return instance;
    }

    public int getCounter() {
        return counter;
    }
}
