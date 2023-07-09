package de.tim0_12432.decorator;

public class EncryptedPayload extends PayloadDecorator {

    public EncryptedPayload(Payload source) {
        super(source);
    }

    @Override
    public String getContent() {
        return getSource().getContent();
    }

    @Override
    public String toString() {
        return "EncryptedPayload [content=" + getSource().getClass().getSimpleName() + "]";
    }
}
