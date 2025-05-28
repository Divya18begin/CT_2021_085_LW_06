package Q1_2;

public class Main {
    public static void main(String[] args) {
        Pet p1=new Pet();
        p1.setName("Tommy");

        Pet p2=new Cat();
        p2.setName("Milo");

        Pet p3=new Dog();
        p3.setName("Baster");

        Cat p4= new Cat();
        p4.setName("Charlie");

        Dog p5=new Dog();
        p5.setName("Blacky");

        System.out.println("Pet 1 name "+p1.getName()+", says: "+p1.speak());
        System.out.println("Pet 2 name "+p2.getName()+", says: "+p2.speak());
        System.out.println("Pet 3 name "+p3.getName()+ ", says: "+p3.speak());
        System.out.println("Pet 4 name "+p4.getName()+ ", says: "+p4.speak());
        System.out.println("Pet 5 name "+p5.getName() +", says: "+p5.speak());
    }
}
