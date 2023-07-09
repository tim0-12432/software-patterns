package de.tim0_12432.proxy;

public class ResourceProxy implements Resource {

    private boolean locked;

    private Resource resource;

    public ResourceProxy() {
        this.locked = true;
        this.resource = new ProtectedResource();
    }

    public void unlock() {
        this.locked = false;
    }

    public void lock() {
        this.locked = true;
    }

    @Override
    public void request() {
        if (this.locked) {
            System.out.println(this.getClass().getSimpleName() + ": Resource is locked!");
        } else {
            this.resource.request();
        }
    }
}
