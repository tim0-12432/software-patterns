package de.tim0_12432.iterator;

public class Main {

    public static void main(String[] args) {

        List test = new List(2, 5, 7, 56, 12, 9, 45);
        ListIterator it = test.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
