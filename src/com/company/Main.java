package com.company;

import com.company.device.Car;
import com.company.device.Device;
import com.company.device.Phone;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] names = {"Kacper","Marian","Janusz","Karolina"};

        Double[] numbers = new Double[5];
        numbers[0] = 231.2;
        numbers[1] = -231.2;
        numbers[2] = 131.2;
        numbers[3] = 4231.2;
        numbers[4] = 2345321.2;

        System.out.println("numbers:");
        for(Double n : numbers){
            System.out.println(n);
        }

        Arrays.sort(numbers);
        System.out.println("posortowane:");

        for(int i = 0; i < numbers.length; i++){
            Double n = numbers[i];
            System.out.println(n);
        }

        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        Animal[] farm = new Animal[4];
        farm[0] = new Animal("dog");

        farm[2] = new Animal("cow");
        farm[3] = new Animal("chicken");

        System.out.println(Arrays.deepToString(farm));

        Arrays.sort(farm,new AnimalWeightComparator());

        System.out.println(Arrays.deepToString(farm));

    }
}
