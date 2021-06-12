package com.company.device;

public interface Rechargeable {
    void rechargeFull();
    void rechargeTo(Double batteryLevel);
    Double getBatteryLevel();
}
