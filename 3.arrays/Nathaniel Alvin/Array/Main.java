package com.vin;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    String[] dogs = {"Siamese", "Persian", "Ragdoll", "Bengal"};

        System.out.println("Here is the content of the array.");
        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i]);
        }

        System.out.println("Here is changing the value of an element. Siamese -> Himalayan");
        System.out.println("Before update: " + dogs[0]);
        dogs[0] = "Himalayan";
        System.out.println("After update: " + dogs[0]);

        System.out.println("Here is adding a new item to an Array. Added Sphynx to the array.");
        String[] newDogs = Arrays.copyOf(dogs, dogs.length + 1); // declaring a larger array and copy the elements from the smaller array

        newDogs[newDogs.length - 1] = "Sphynx"; // added Sphynx to the last index of the array
    }
}
