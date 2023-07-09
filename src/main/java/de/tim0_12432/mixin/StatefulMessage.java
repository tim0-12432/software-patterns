package de.tim0_12432.mixin;

public class StatefulMessage extends StatefulObject implements Escalatable, Numeric {

    private final String message;

    public StatefulMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
