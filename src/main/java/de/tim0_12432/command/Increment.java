package de.tim0_12432.command;

public class Increment implements Command {

    private Receiver receiver;

    public Increment(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.increment();
    }

    @Override
    public void undo() {
        receiver.decrement();
    }
}
