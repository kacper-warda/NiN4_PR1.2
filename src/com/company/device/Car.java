package com.company.device;

import com.company.Human;

public class Car extends Device {
    public Double millage;
    public Double engineVolume;
    private Double value;

    public Car(String producer, String model, Integer productionYear, Double millage, Double engineVolume, Double value) {
        super(producer, model, productionYear);
        this.millage = millage;
        this.engineVolume = engineVolume;
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", millage=" + millage +
                ", engineVolume=" + engineVolume +
                ", value=" + value +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("otwieram drzwi");
        System.out.println("kluczyk w stacyjkę");
        System.out.println("kręcę");
        System.out.println("zapalił");
    }
}
