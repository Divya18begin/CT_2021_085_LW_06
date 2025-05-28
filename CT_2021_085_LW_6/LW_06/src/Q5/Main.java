package Q5;

import Q1.Pet;
import Q4.Cat2;
import Q4.Dog2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Pet> pets = new ArrayList<>();

        // Step 1: Collect input for Dog and Cat objects
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
                    System.out.println("Invalid input. Weight set to 0.");
                    dog.setWeight(0);
                }
                pets.add(dog);
            } else {
                System.out.println("Invalid type. Please enter 'c' or 'd'.");
            }
        }

        // Step 2: Create a separate Dog array
        ArrayList<Dog2> dogs = new ArrayList<>();
        for (Pet p : pets) {
            if (p instanceof Dog2 dog) {
                dogs.add(dog);
            }
        }

        // Step 3: Print all dog details
        System.out.println("\n--- List of Dogs ---");
        if (dogs.isEmpty()) {
            System.out.println("No dogs found.");
        } else {
            for (Dog2 d : dogs) {
                System.out.println("Name: " + d.getName() + ", Weight: " + d.getWeight() + " kg");
            }

            // Step 4: Calculate average, min, and max weights
            double totalWeight = 0;
            double minWeight = Double.MAX_VALUE;
            double maxWeight = Double.MIN_VALUE;
            Dog2 minDog = null;
            Dog2 maxDog = null;

            for (Dog2 d : dogs) {
                double w = d.getWeight();
                totalWeight += w;

                if (w < minWeight) {
                    minWeight = w;
                    minDog = d;
                }

                if (w > maxWeight) {
                    maxWeight = w;
                    maxDog = d;
                }
            }

            double average = totalWeight / dogs.size();

            // Step 5: Print weight statistics
            System.out.println("\n--- Dog Weight Stats ---");
            System.out.printf("Average Weight: %.2f kg\n", average);
            System.out.printf("Minimum Weight: %.2f kg (Dog: %s)\n", minWeight, minDog.getName());
            System.out.printf("Maximum Weight: %.2f kg (Dog: %s)\n", maxWeight, maxDog.getName());
        }
    }
}
