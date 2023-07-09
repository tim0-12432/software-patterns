package de.tim0_12432.factory;

public class EnergySensor extends AbstractProduct {

    private double energy;
    private double power;

    public EnergySensor() {
        this.energy = 0.0;
        this.power = 0.0;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getEnergy() {
        return this.energy;
    }

    public double getPower() {
        return this.power;
    }
}
