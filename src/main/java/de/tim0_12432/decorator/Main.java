package de.tim0_12432.decorator;

public class Main {

    public static void main(String[] args) {

        TextPayload tp = new TextPayload("Hello World!");
        System.out.println(tp.getContent());
        System.out.println(tp.toString() + "\n");

        GzipPayload gp = new GzipPayload(tp);
        System.out.println(gp.getContent());
        System.out.println(gp.toString() + "\n");

        EncryptedPayload ep = new EncryptedPayload(gp);
        System.out.println(ep.getContent());
        System.out.println(ep.toString());
    }
}
