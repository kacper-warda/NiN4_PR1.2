package com.company;

import com.company.device.Car;
import com.company.device.Device;
import com.company.device.Phone;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("dog");
        dog.name = "Puszek";
        dog.feed();
        dog.takeForAWalk();

        Phone iphone = new Phone("apple", "S6", 2020,
                "iOS", 4.5);

        System.out.println("producer = " + iphone.producer);
        System.out.println("name = " + dog.name);


        Human me = new Human(1000.0);
        me.firstName = "Kacper";
        me.lastName = "Warda";
        me.age = 99;
        me.phone = iphone;

        Car fiat = new Car("fiat",
                "bravo",
                2015,
                315000.0,
                1.6,
                13000.0);

        me.setCar(fiat);

        Double mySalary = me.getSalary();
        Double newSalary = mySalary * 1.2;
        me.setSalary(newSalary);

        me.setCar(fiat);

        System.out.println("licznik: "+me.getCar().millage);

        Car myFiat = me.getCar();
        myFiat.millage = 150000.0;

        System.out.println("licznik: "+me.getCar().millage);

        System.out.println("Człowiek: " + me);
        System.out.println(fiat);
        System.out.println(myFiat);

        iphone.installAnApp("facebóg");
        iphone.installAnApp("signal","2.1.3");



    }
}
