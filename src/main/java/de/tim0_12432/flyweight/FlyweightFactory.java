package de.tim0_12432.flyweight;

import java.util.HashMap;

public class FlyweightFactory {

    private final HashMap<Integer, Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyweight(int number) {
        if (flyweights.containsKey(number)) {
            return flyweights.get(number);
        } else {
            Flyweight flyweight = new File(number);
            flyweights.put(number, flyweight);
            return flyweight;
        }
    }
}
