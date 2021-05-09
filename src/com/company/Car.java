package com.company;

public class Car {
    public final String producer;
    public final String model;
    public Double millage;
    public Double engineVolume;
    private Double value;

    public Car(String producer, String model, Double millage, Double engineVolume, Double value) {
        this.producer = producer;
        this.model = model;
        this.millage = millage;
        this.engineVolume = engineVolume;
        this.value = value;
    }

    public Double getValue() {
        return value;
    }
}
