package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApplication {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of pets");
        int numberOfPets = sc.nextInt();

        //create list
        Pet[]pets = new Pet[numberOfPets];

        //loop through num pets
        for(int i =0; i<numberOfPets;i++){
            System.out.println("Please choose one of the following pets:\n[Cat,Dog,Hamster]");
            String typesOfPets = sc.next();
            System.out.println("Enter name of your Pets:");
            String nameOfPets = sc.next();
            if(typesOfPets.equals("Cat")){
                Cat cat = new Cat(nameOfPets);
                pets[i] = cat;
            } else if (typesOfPets.equals("Dog")) {
                Dog dog = new Dog(nameOfPets);
                pets[i] = dog;
            } else if (typesOfPets == "Hamster") {
                Hamster ham = new Hamster();
                pets[i] = ham;

            }else {
                System.out.println("Incorrect pet type");
                i--;
            }

        }
        System.out.println("Here is the list of your pets!");
        for(Pet p : pets){
            System.out.println(p.getName()+" : "+p.speak());
        }

    }


    //iterate through list and print name and speak sound


}
