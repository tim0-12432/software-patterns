package de.tim0_12432.composite;

public class Shoes extends Element {

    @Override
    String printOut() {
        return "Shoes";
    }

    @Override
    int getCount() {
        return 1;
    }
}
