package de.tim0_12432.proxy;

public class Main {

    public static void main(String[] args) {

        ResourceProxy proxy = new ResourceProxy();
        proxy.lock();
        proxy.request();

        proxy.unlock();
        proxy.request();
    }
}
