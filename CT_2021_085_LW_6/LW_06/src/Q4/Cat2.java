package Q4;

import Q1.Pet;

public class Cat2 extends Pet {
    private String coatColor;

    public String getCoatColor() {
        return coatColor;
    }

    public void setCoatColor(String coatColor) {
        this.coatColor = coatColor;
    }

    @Override
    public String speak() {
        return ("Meow!");
    }
}
