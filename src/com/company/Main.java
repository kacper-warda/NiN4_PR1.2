package com.company;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("dog");
        dog.name = "Puszek";
        dog.feed();

        Phone iphone = new Phone("apple", "S6", "iOS", 4.5);

        System.out.println("producer = " + iphone.producer);
        System.out.println("name = " + dog.name);


        Human me = new Human(1000.0);
        me.phone = iphone;

        Double mySalary = me.getSalary();

        Double newSalary = mySalary * 1.2;

        me.setSalary(newSalary);

    }
}
