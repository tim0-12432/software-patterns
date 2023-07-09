package de.tim0_12432.factory;

public class SensorFactory implements AbstractFactory {

    @Override
    public AbstractProduct createProduct(SensorTypes type) {
        switch (type) {
            case ENERGY -> {
                return new EnergySensor();
            }
            case WATER -> {
                return new WaterSensor();
            }
            case PRESENCE -> {
                return new PresenceDetector();
            }
            default -> {
                return null;
            }
        }
    }
}
