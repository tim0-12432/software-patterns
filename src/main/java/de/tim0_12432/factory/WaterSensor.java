package de.tim0_12432.factory;

public class WaterSensor extends AbstractProduct {

    private double volume;

    public WaterSensor() {
        this.volume = 0.0;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return this.volume;
    }
}
