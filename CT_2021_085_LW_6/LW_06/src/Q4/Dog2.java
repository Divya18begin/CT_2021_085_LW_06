package Q4;

import Q1.Pet;

public class Dog2 extends Pet {
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String speak() {
        return ("Woof! Woof!");
    }
}
