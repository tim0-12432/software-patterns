package de.tim0_12432.composite;

public class Main {

    public static void main(String[] args) {

        Package p = new Package();
        p.add(new Tshirt());
        p.add(new Pants());

        Package p2 = new Package();
        p2.add(new Shoes());
        p.add(p2);

        System.out.println(p.printOut());

    }
}
