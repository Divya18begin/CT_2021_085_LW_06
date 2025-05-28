package Q3;

import Q1.Cat;
import Q1.Dog;
import Q1.Pet;

import java.util.ArrayList;
import java.util.Scanner;

public class PetArray4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Pet> pets = new ArrayList<>();

        while (true) {
            System.out.print("Enter pet name (or STOP to end): ");
            String name = input.nextLine();
            if (name.equalsIgnoreCase("STOP")) break;

            System.out.print("Enter type (c for cat, d for dog): ");
            String type = input.nextLine();

            Pet pet = type.equalsIgnoreCase("c") ? new Cat() : new Dog();
            pet.setName(name);
            pets.add(pet);
        }

        System.out.println("\n--- List of Cats ---");
        for (Pet p : pets) {
            if (p instanceof Cat) {
                System.out.println("Name: " + p.getName());
            }
        }

        System.out.println("\n--- List of Dogs ---");
        for (Pet p : pets) {
            if (p instanceof Dog) {
                System.out.println("Name: " + p.getName());
            }
        }
    }
}
