package Q2_3;

import Q1.Cat;
import Q1.Dog;
import Q1.Pet;

import java.util.Scanner;

public class PetArray3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pet[] pets = new Pet[100]; // maximum 100 pets
        int count = 0;

        while (true) {
            System.out.print("Enter pet name (or STOP to end): ");
            String name = input.nextLine();
            if (name.equalsIgnoreCase("STOP")) break;

            System.out.print("Enter type (c for cat, d for dog): ");
            String type = input.nextLine();

            Pet pet;
            if (type.equalsIgnoreCase("c")) {
                pet = new Cat();
            } else {
                pet = new Dog();
            }

            pet.setName(name);
            pets[count++] = pet;
        }

        for (int i = 0; i < count; i++) {
            System.out.println("Name: " + pets[i].getName() + ", Type: " + pets[i].getClass().getSimpleName());
        }
    }
}
