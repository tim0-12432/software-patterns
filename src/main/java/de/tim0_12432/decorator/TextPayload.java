package de.tim0_12432.decorator;

public class TextPayload extends Payload {

    private final String text;

    public TextPayload(String text) {
        this.text = text;
    }

    @Override
    public String getContent() {
        return text;
    }

    @Override
    public String toString() {
        return "TextPayload [text=" + text + "]";
    }
}
