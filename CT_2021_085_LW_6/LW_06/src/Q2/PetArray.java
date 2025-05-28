package Q2;

import Q1.Cat;
import Q1.Dog;
import Q1.Pet;

import java.util.ArrayList;
import java.util.Scanner;

public class PetArray {
    public static void main(String[] args) {
        ArrayList<Pet> pets = collectPets();
        displayPets(pets);

    }
         private static ArrayList<Pet> collectPets(){
            Scanner input = new Scanner(System.in);
            ArrayList<Pet> petList = new ArrayList<>();

            while (true) {
                System.out.print("Enter pet name (or STOP to end): ");
                String name = input.nextLine();
                if (name.equalsIgnoreCase("STOP")) break;

                System.out.print("Enter type (c for cat, d for dog): ");
                String type = input.nextLine();

                Pet pet = type.equalsIgnoreCase("c") ? new Cat() : new Dog();
                pet.setName(name);
                petList.add(pet);
                System.out.println();
            }
             System.out.println("\n");
             return petList;
        }
            public static void displayPets(ArrayList<Pet> pets) {
                for (Pet p : pets) {
                    System.out.println("Name: " + p.getName() + ", Type: " + p.getClass().getSimpleName());
                }
        }
    }



