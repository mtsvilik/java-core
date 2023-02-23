package javacore.homework.methodininterface;

public class Swordfish extends Fish {
    public Swordfish(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Swordfish is not a predatory fish and it eats ordinary fish food");
    }

    @Override
    public void swim() {
        System.out.println("Swordfish is a beautiful fish that swim fast");
    }
}
