package com.company;

public class Phone {
    public final String producer;
    public final String model;
    public final String operationSystem;
    private Double screenSize;

    public Phone(String producer, String model, String operationSystem, Double screenSize) {
        this.producer = producer;
        this.model = model;
        this.operationSystem = operationSystem;
        this.setScreenSize(screenSize);
    }


    public Double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Double screenSize) {
        //logika
        this.screenSize = screenSize;
    }
}
