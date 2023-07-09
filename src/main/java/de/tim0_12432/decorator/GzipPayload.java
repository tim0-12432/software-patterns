package de.tim0_12432.decorator;

public class GzipPayload extends PayloadDecorator {

    public GzipPayload(Payload source) {
        super(source);
    }

    @Override
    public String getContent() {
        return getSource().getContent();
    }

    @Override
    public String toString() {
        return "GzipPayload [content=" + getSource().getClass().getSimpleName() + "]";
    }
}
