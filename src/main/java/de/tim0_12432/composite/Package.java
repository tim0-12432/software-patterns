package de.tim0_12432.composite;

import java.util.ArrayList;
import java.util.List;

public class Package extends Element {

    private final List<Element> elements = new ArrayList<>();

    public void add(Element element) {
        elements.add(element);
    }

    @Override
    String printOut() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (Element element : elements) {
            sb.append(element.printOut() + " ");
        }
        sb.append(']');
        return sb.toString();
    }
}
