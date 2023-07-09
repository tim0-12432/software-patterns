package de.tim0_12432.observer;

public class Display implements Observer<States> {

    private final String name;

    public Display(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable obj, States arg) {
        System.out.println(
                name
                        + ": "
                        + "System state changed to " + arg + "..."
        );
    }
}
