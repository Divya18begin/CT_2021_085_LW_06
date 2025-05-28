package Q4_2;

import Q4.Cat2;
import Q4.Dog2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Cat2> cats = new ArrayList<>();
        ArrayList<Dog2> dogs = new ArrayList<>();

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
                cats.add(cat);
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
                        dogs.add(dog);
            } else {
                    System.out.println("Invalid type! Please enter 'c' or 'd'.");
            }
                    }

                    // Output Cats
                    System.out.println("\n--- List of Cats ---");
        for (Cat2 c : cats) {
        System.out.println("Name: " + c.getName() + ", Coat Color: " + c.getCoatColor());
        }

        // Output Dogs
        System.out.println("\n--- List of Dogs ---");
        for (Dog2 d : dogs) {
        System.out.println("Name: " + d.getName() + ", Weight: " + d.getWeight() + " kg");
        }
        }
        }