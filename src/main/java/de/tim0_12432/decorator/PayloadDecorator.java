package de.tim0_12432.decorator;

public abstract class PayloadDecorator extends Payload {

    private final Payload source;

    public PayloadDecorator(Payload source) {
        this.source = source;
    }

    public Payload getSource() {
        return source;
    }
}
