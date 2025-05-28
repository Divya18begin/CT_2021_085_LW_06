package Q6;
import Q1.Pet;
import Q4.Cat2;
import Q4.Dog2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Pet> pets = new ArrayList<>();
        ArrayList<Dog2> dogs = new ArrayList<>();
        ArrayList<Cat2> cats = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n--- Pet Management Menu ---");
            System.out.println("1. Add Cat");
            System.out.println("2. Add Dog");
            System.out.println("3. Remove Cat");
            System.out.println("4. Remove Dog");
            System.out.println("0. Quit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1 -> {
                    Cat2 cat = new Cat2();
                    System.out.print("Enter cat name: ");
                    cat.setName(input.nextLine());

                    // Validate coat color (must contain at least one letter)
                    while (true) {
                        System.out.print("Enter coat color: ");
                        String color = input.nextLine();
                        if (color.matches(".*[a-zA-Z]+.*")) {
                            cat.setCoatColor(color);
                            break;
                        } else {
                            System.out.println("Invalid coat color. It must contain letters.");
                        }
                    }

                    cats.add(cat);
                    pets.add(cat);
                    System.out.println("Cat added successfully!");
                }

                case 2 -> {
                    Dog2 dog = new Dog2();
                    System.out.print("Enter dog name: ");
                    dog.setName(input.nextLine());

                    // Validate weight (must be >= 0)
                    while (true) {
                        System.out.print("Enter weight (in kg): ");
                        try {
                            double weight = Double.parseDouble(input.nextLine());
                            if (weight > 0) {
                                dog.setWeight(weight);
                                break;
                            } else {
                                System.out.println("Weight cannot be negative or Zero. Try again.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input! Please enter a valid number.");
                        }
                    }

                    dogs.add(dog);
                    pets.add(dog);
                    System.out.println("Dog added successfully!");
                }

                case 3 -> {
                    System.out.print("Enter cat name to remove: ");
                    String nameToRemove = input.nextLine();

                    Cat2 toRemove = null;
                    for (Cat2 c : cats) {
                        if (c.getName().equalsIgnoreCase(nameToRemove)) {
                            toRemove = c;
                            break;
                        }
                    }

                    if (toRemove != null) {
                        cats.remove(toRemove);
                        pets.remove(toRemove);
                        System.out.println("Cat removed successfully.");
                    } else {
                        System.out.println("Cat not found.");
                    }
                }

                case 4 -> {
                    System.out.print("Enter dog name to remove: ");
                    String nameToRemove = input.nextLine();

                    Dog2 toRemove = null;
                    for (Dog2 d : dogs) {
                        if (d.getName().equalsIgnoreCase(nameToRemove)) {
                            toRemove = d;
                            break;
                        }
                    }

                    if (toRemove != null) {
                        dogs.remove(toRemove);
                        pets.remove(toRemove);
                        System.out.println("Dog removed successfully.");
                    } else {
                        System.out.println("Dog not found.");
                    }
                }

                case 0 -> System.out.println("Exiting...");

                default -> System.out.println("Invalid choice. Please try again.");
            }

            // Show updated lists
            System.out.println("\n--- Current Cats ---");
            for (Cat2 c : cats) {
                System.out.println("->Name: " + c.getName() + ",        Coat Color: " + c.getCoatColor());
            }

            System.out.println("\n--- Current Dogs ---");
            for (Dog2 d : dogs) {
                System.out.println("->Name: " + d.getName() + ",        Weight: " + d.getWeight() + " kg");
            }

        } while (choice != 0);
    }
}
