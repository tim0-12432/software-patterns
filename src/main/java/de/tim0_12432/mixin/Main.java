package de.tim0_12432.mixin;

public class Main {

    public static void main(String[] args) {
        StatefulMessage message = new StatefulMessage("Hello World");

        System.out.println(message.getMessage());

        System.out.println(message.escalated());

        System.out.println(message.asNumeric());
    }
}
