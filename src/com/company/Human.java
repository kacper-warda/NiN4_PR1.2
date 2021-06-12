package com.company;

import com.company.device.Car;
import com.company.device.Phone;

import java.util.Date;

public class Human extends Animal {
    private static final String HUMAN_SPECIES = "homo sapiens";
    String firstName;
    String lastName;

    Phone phone;
    Animal pet;
    private Car car;
    private Double salary;

    public Human(Double salary) {
        super(HUMAN_SPECIES);
        this.salary = salary;
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

    public Car getCar() {
        return this.car;
    }

    public void setCar(Car car) {
        if (this.salary > car.getValue()) {
            System.out.println("ZAKUP AUTA: gratulacje, kupiłeś za gotówkę");
            this.car = car;
        } else if (this.salary > car.getValue() / 12.0) {
            System.out.println("ZAKUP AUTA: nie aż takie gratulacje, kupiłeś na kredyt");
            this.car = car;
        } else {
            System.out.println("ZAKUP AUTA: porażka, zmień pracę");
        }
    }

    public String toString() {
        return this.firstName + " " + this.lastName + " " + this.age + "l";
    }
}
