package Q4_3;

import Q1.Pet;
import Q4.Cat2;
import Q4.Dog2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Pet> pets = new ArrayList<>();

        // Input Loop
        while (true) {
            System.out.print("Enter pet name (or STOP to end): ");
            String name = input.nextLine();
            if (name.equalsIgnoreCase("STOP")) break;

            System.out.print("Enter type (c for cat, d for dog): ");
            String type = input.nextLine();

            if (type.equalsIgnoreCase("c")) {
                Cat2 cat = new Cat2();
                cat.setName(name);
                System.out.print("Enter coat color: ");
                cat.setCoatColor(input.nextLine());
                pets.add(cat);
            } else if (type.equalsIgnoreCase("d")) {
                Dog2 dog = new Dog2();
                dog.setName(name);
                System.out.print("Enter weight (in kg): ");
                try {
                    dog.setWeight(Double.parseDouble(input.nextLine()));
                } catch (NumberFormatException e) {
                    System.out.println("Invalid weight! Setting to 0.");
                    dog.setWeight(0);
                }
                pets.add(dog);
            } else {
                System.out.println("Invalid type! Please enter 'c' or 'd'.");
            }
        }

        // Grouped Output
        System.out.println("\n--- List of Cats ---");
        for (Pet p : pets) {
            if (p instanceof Cat2 cat) {
                System.out.println("Name: " + cat.getName() + ", Coat Color: " + cat.getCoatColor());
            }
        }

        System.out.println("\n--- List of Dogs ---");
        for (Pet p : pets) {
            if (p instanceof Dog2 dog) {
                System.out.println("Name: " + dog.getName() + ", Weight: " + dog.getWeight() + " kg");
            }
        }
    }
}
