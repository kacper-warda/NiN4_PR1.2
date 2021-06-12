package com.company.device;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Phone extends Device implements Rechargeable, Comparable<Phone> {
    private static final String DEFAULT_APP_VERSION = "latest";
    public final String operationSystem;
    private Double screenSize;

    public Phone(String producer, String model, Integer productionYear,
                 String operationSystem, Double screenSize) {

        super(producer, model, productionYear);
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

    @Override
    public void turnOn() {
        System.out.println("wciskam przycisk");
        System.out.println("czekam");
        System.out.println("czekam");
        System.out.println("czekam");
        System.out.println("idę po kabel");
        System.out.println("o włączyło się");
    }

    @Override
    public void rechargeFull() {
        System.out.println("ok naładowano");
    }

    @Override
    public void rechargeTo(Double batteryLevel) {
        System.out.println("ok naładowano do " + batteryLevel);
    }

    @Override
    public Double getBatteryLevel() {
        return 0.1;
    }

    @Override
    public int compareTo(Phone o) {
        return 0;
    }

    public void installAnApp(String appName) {
        this.installAnApp(appName, DEFAULT_APP_VERSION);
    }

    public void installAnApp(List<String> appNames) {
        for (String appName : appNames) {
            this.installAnApp(appName);
        }
    }

    public void installAnApp(String appName, String version) {
        try {
            URL url = new URL("https", "appserver.com", 443, appName + "_" + version);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    private void installAnApp(URL url) {
        //sprawdzenie czy aplikacja jest płatna
        //obsługa akceptacji płatności
        //sprawdzanie czy mam kasę jeżeli jest płatna
        //sprawdzenie miejsca na dysku
        //obsługa płatności
        //pobieranie
        //walidacja pliku
        //skanowanie wirusów
        //rozpakowanie
        //instalacja
    }
}
