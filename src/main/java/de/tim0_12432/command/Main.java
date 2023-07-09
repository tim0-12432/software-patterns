package de.tim0_12432.command;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        ArrayList<Command> commands = new ArrayList<>(List.of(
                new Increment(receiver),
                new Increment(receiver),
                new Decrement(receiver),
                new Increment(receiver),
                new Increment(receiver),
                new Increment(receiver),
                new Decrement(receiver),
                new Increment(receiver)
        ));

        for (Command command : commands) {
            command.execute();
            System.out.print(receiver.getValue() + " ");
        }
        System.out.println("\n");

        Collections.reverse(commands);
        for (Command command : commands) {
            System.out.print(receiver.getValue() + " ");
            command.undo();
        }
    }
}
