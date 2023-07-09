package de.tim0_12432.singleton;

public class Main {

    public static void main(String[] args) {
        CallCounter ctr1 = CallCounter.getInstance();
        System.out.println("Counter 1: " + ctr1.getCounter());

        CallCounter ctr2 = CallCounter.getInstance();
        System.out.println("Counter 1: " + ctr1.getCounter());
        System.out.println("Counter 2: " + ctr2.getCounter());
    }
}
