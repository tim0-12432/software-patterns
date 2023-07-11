package de.tim0_12432.composite;

public class Main {

    public static void main(String[] args) {

        Package p = new Package();
        p.add(new Tshirt());
        p.add(new Pants());

        Package p2 = new Package();
        p2.add(new Shoes());
        p.add(p2);

        Package p3 = new Package();
        p3.add(new Shoes());
        p.add(p3);

        Package p4 = new Package();
        p4.add(new Tshirt());
        p4.add(new Pants());
        p4.add(new Tshirt());
        p.add(p4);

        Package p5 = new Package();
        p5.add(new Tshirt());
        p4.add(p5);

        System.out.println(p.printOut());
        System.out.println(p.getCount() + " items");
    }
}
