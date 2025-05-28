package Q2_2;

import Q1.Cat;
import Q1.Dog;
import Q1.Pet;

import java.util.ArrayList;
import java.util.Scanner;

public class PetArray2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        ArrayList<Pet> pets= new ArrayList<>();

        //Input Loop
        while(true) {
            System.out.println("Enter pet name or STOP to end: ");
            String name = input.nextLine();
            if(name.equalsIgnoreCase("STOP")){
                break;
            }
            System.out.println("Enter type ( c for cat & d for dog) :");
            String type= input.nextLine();

            Pet pet;
            if(type.equalsIgnoreCase("c")){
                pet=new Cat();
            }else if(type.equalsIgnoreCase("d")){
                pet=new Dog();
            }else{
                System.out.println("Invalid Entry!");
                continue;
            }
            pet.setName(name);
            pets.add(pet);
        }

        //Output loop
        System.out.println("\n--- Pet List ---");
        for (Pet p : pets) {
            String type = (p instanceof Cat) ? "Cat" : "Dog";
            System.out.println("Name: " + p.getName() + ", Type: " + type);
        }
    }
}
