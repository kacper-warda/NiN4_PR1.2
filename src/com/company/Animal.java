package com.company;

import java.io.File;

public class Animal {
    final String species;
    public String name;
    private Double weight;
    File pic;

    static public final Double DEFAULT_ANIMAL_WEIGHT = 1.0;

    Animal(String species) {
        this.species = species;

        switch (this.species) {
            case "dog":
                this.weight = 20.0;
                break;
            case "cat":
                this.weight = 2.0;
                break;
            case "cow":
                this.weight = 400.0;
                break;
            default:
                this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }

    public void feed() {
        if(weight > 0){
            this.weight += 1;
            System.out.println("thx for food. My weight is now: " + this.weight);
        }else {
            System.out.println("too late, sorry");
        }
    }

    public void takeForAWalk() {
        if(this.weight > 0){
            this.weight -= 1;
            System.out.println("thx for a walk, my weight is now " + this.weight);
        } else {
            System.out.println("U CANNOT WALK THE STREET WITH DEAD ANIMAL IDIOT!");
        }
    }
}
