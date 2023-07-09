package de.tim0_12432.mixin;

public interface Numeric extends Stateful {

    String getMessage();

    default String asNumeric() {
        StringBuilder builder = new StringBuilder();
        for (char c : getMessage().toCharArray()) {
            builder.append((int) c);
        }
        return builder.toString();
    }
}
