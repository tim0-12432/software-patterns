package de.tim0_12432.factory;

public interface AbstractFactory {

    AbstractProduct createProduct(SensorTypes type);
}
