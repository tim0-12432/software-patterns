package de.tim0_12432.proxy;

public class ProtectedResource implements Resource {

    @Override
    public void request() {
        System.out.println(this.getClass().getSimpleName() + ": Requesting resource...");
    }
}
