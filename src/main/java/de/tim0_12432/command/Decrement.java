package de.tim0_12432.command;

public class Decrement implements Command {

    private Receiver receiver;

    public Decrement(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.decrement();
    }

    @Override
    public void undo() {
        receiver.increment();
    }
}
