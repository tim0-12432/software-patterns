package de.tim0_12432.observer;

public class Main {

    public static void main(String[] args) {
        SystemState systemState = new SystemState();

        Display display1 = new Display("Display 1");
        Display display2 = new Display("Display 2");

        systemState.addObserver(display1);
        systemState.addObserver(display2);

        systemState.notifyObservers(States.ON);
        systemState.notifyObservers(States.ERROR);
    }
}
