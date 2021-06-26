package com.company;

import com.company.device.Car;
import com.company.device.Phone;

import java.util.Date;

public class Human extends Animal {
    private static final String HUMAN_SPECIES = "homo sapiens";
    private static final int DEFAULT_GARAGE_SIZE = 4;
    String firstName;
    String lastName;

    Phone phone;
    Animal pet;
    private Car[] garage;
    private Double salary;

    private Double cash = 0.0;

    public Human(Double salary) {
        super(HUMAN_SPECIES);
        this.salary = salary;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }

    public Double getSalary() {
        System.out.println("pobrana wartość wynagrodzenia: " + this.salary);
        System.out.println("termin pobrania informacji: " + new Date());
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary < 0.0) {
            System.out.println("sorry, nikt za darmo robić nie będzie");
        } else {
            System.out.println("dane wysłane do księgowego");
            System.out.println("koniecznie odbierz aneks od pani Hani!");
            System.out.println("ZUS i US już o wszystkim wiedzą");
            this.salary = salary;
        }
    }

    public Car getCar(Integer parkNumber) {
        return this.garage[parkNumber];
    }

    public void setCar(Car car,Integer parkNumber) {
        if (this.salary > car.getValue()) {
            System.out.println("ZAKUP AUTA: gratulacje, kupiłeś za gotówkę");
            this.garage[parkNumber] = car;
        } else if (this.salary > car.getValue() / 12.0) {
            System.out.println("ZAKUP AUTA: nie aż takie gratulacje, kupiłeś na kredyt");
            this.garage[parkNumber] = car;
        } else {
            System.out.println("ZAKUP AUTA: porażka, zmień pracę");
        }
    }

    public String toString() {
        return this.firstName + " " + this.lastName + " " + this.age + "l";
    }

    @Override
    public void sell(Human seller, Human buyer, Double price){
        System.out.println("HALO POLICJA!!!!!!");
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

    public boolean haveCar(Car car) {
        for(int i = 0; i < this.garage.length; i++){
            if(car == this.garage[i])
                return true;
        }
        return false;
    }
}
