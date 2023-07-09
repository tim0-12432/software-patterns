package de.tim0_12432.factory;

public class PresenceDetector extends AbstractProduct {

    private boolean presence;

    public PresenceDetector() {
        this.presence = false;
    }

    public void togglePresence() {
        this.presence = !presence;
    }

    public boolean getPresence() {
        return this.presence;
    }
}
