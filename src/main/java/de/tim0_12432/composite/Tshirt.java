package de.tim0_12432.composite;

public class Tshirt extends Element {

    @Override
    String printOut() {
        return "Tshirt";
    }

    @Override
    int getCount() {
        return 1;
    }
}
