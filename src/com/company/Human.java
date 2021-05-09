package com.company;

import java.util.Date;

public class Human {
    String firstName;
    String lastName;
    Integer age;
    String sex;

    Phone phone;
    Animal pet;

    private Double salary;

    public Human(Double salary) {
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
}
