package de.tim0_12432.flyweight;

public class Main {

    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        Flyweight file1 = factory.getFlyweight(1);
        Flyweight file2 = factory.getFlyweight(2);
        Flyweight file3 = factory.getFlyweight(3);

        System.out.println(file1.loadCaptions()[0]);
        System.out.println(file2.loadCaptions()[0]);
        System.out.println(file3.loadCaptions()[0]);

        Flyweight copy1 = factory.getFlyweight(1);
        Flyweight copy2 = factory.getFlyweight(2);

        System.out.println(file1 == copy1);
        System.out.println(file2 == copy2);
    }
}
