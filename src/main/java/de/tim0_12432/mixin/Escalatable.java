package de.tim0_12432.mixin;

import java.util.Locale;

public interface Escalatable extends Stateful {

    String getMessage();

    default String escalated() {
        return getMessage().toUpperCase(Locale.ROOT) + "!";
    }
}
