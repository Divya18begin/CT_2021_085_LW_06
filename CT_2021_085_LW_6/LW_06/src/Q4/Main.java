package Q4;

import Q1.Pet;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Pet> pets= new ArrayList<>();

        while(true){
            System.out.print("\nEnter pet name (or STOP to end): ");
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
                System.out.print("Enter weight: ");
                try {
                    dog.setWeight(Double.parseDouble(input.nextLine()));
                } catch (NumberFormatException e) {
                    System.out.println("Invalid weight, setting to 0.");
                    dog.setWeight(0);
                }
                pets.add(dog);
            } else {
                System.out.println("Invalid type! Skipping entry.");
            }

            // Display results
            System.out.println("\n--- Pet List ---");
            for (Pet p : pets) {
                if (p instanceof Cat2 cat) {
                    System.out.println("Type: Cat, Name: " + cat.getName() + ", Coat Color: " + cat.getCoatColor());
                } else if (p instanceof Dog2 dog) {
                    System.out.println("Type: Dog, Name: " + dog.getName() + ", Weight: " + dog.getWeight() + " kg");
                }
            }
        }
    }
}
