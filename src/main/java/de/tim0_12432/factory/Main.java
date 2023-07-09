package de.tim0_12432.factory;

public class Main {

    public static void main(String[] args) {
        AbstractFactory factory = new SensorFactory();

        AbstractProduct nrgSensor = factory.createProduct(SensorTypes.ENERGY);
        assert nrgSensor instanceof EnergySensor;
        assert ((EnergySensor) nrgSensor).getPower() == 0;

        AbstractProduct wtrSensor = factory.createProduct(SensorTypes.WATER);
        assert wtrSensor instanceof WaterSensor;
        assert ((WaterSensor) wtrSensor).getVolume() == 0;
    }
}
